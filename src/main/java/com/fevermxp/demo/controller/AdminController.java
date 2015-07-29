package com.fevermxp.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fevermxp.demo.common.C;
import com.fevermxp.demo.common.RightsHelper;
import com.fevermxp.demo.common.Tools;
import com.fevermxp.demo.entity.Menu;
import com.fevermxp.demo.entity.UserInfo;
import com.fevermxp.demo.service.IMenuService;
import com.fevermxp.demo.service.IUserInfoService;

@Controller
@RequestMapping("/admin")
public class AdminController extends AbstractBaseCotroller {
	private final static String USID_COOKIE = "loginid";
	@Resource
	IUserInfoService iuserInfoService;
	@Resource
	IMenuService imenuService;
	
	/**
	 * 登录页面
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String toLoginPage(Model model,
			HttpServletRequest request){
		model.addAttribute("loginid", StringUtils.trim(super.getCookie(request, USID_COOKIE)));
		return "admin/login";
	}
	
	/**
	 * 用户登录
	 * @param model
	 * @param session
	 * @param request
	 * @param response
	 * @param str
	 */
	@RequestMapping(value = "/login" , method = RequestMethod.POST)
	public void signin(Model model,
			HttpSession session,
			HttpServletRequest request,
			HttpServletResponse response,
			UserInfo user) {
		Map<String,Object> result = new HashMap<String,Object>();
		if(user.getLogin().trim() == null||user.getPass().trim()==null){
			result.put("result", "账号或密码为空...");
			super.ajaxReturn(response, JSONObject.fromObject(result).toString());
			return;
		}

		boolean current = iuserInfoService.selectUserByLogin(user.getLogin().trim());
		if(!current){
			result.put("result", "账号不存在...");
			super.ajaxReturn(response, JSONObject.fromObject(result).toString());
			return;
		}
		
		UserInfo _user = iuserInfoService.selectUserByUser(user);
		current = StringUtils.equals(user.getPass(),_user.getPass());
		if(!current){
			result.put("result", "密码错误...");
			super.ajaxReturn(response, JSONObject.fromObject(result).toString());
			return;
		}
		
		if(_user.getUsertype()<1){
			result.put("result", "用户已禁用...");
			super.ajaxReturn(response, JSONObject.fromObject(result).toString());
			return;
		}
		session.setAttribute(C.ADMIN_SESSION_KEY, _user);
		
		String userRights = _user.getRights();
		List<Menu> menuList = imenuService.listAllMenu();
		if(Tools.notEmpty(userRights)){
			for(Menu menu : menuList){
				menu.setHasMenu(RightsHelper.testRights(userRights, menu.getMenuId()));
				if(menu.isHasMenu()){
					List<Menu> subMenuList = menu.getSubMenu();
					for(Menu sub : subMenuList){
						sub.setHasMenu(RightsHelper.testRights(userRights, sub.getMenuId()));
					}
				}
			}
		}
		session.setAttribute(C.MENU_KEY, menuList);
		session.setAttribute(C.IS_ADMIN, _user.getUsertype());
		super.setCookie(response, USID_COOKIE, _user.getLogin(), 7*24*3600);
		result.put("result", _user.getUsertype());
		super.ajaxReturn(response, JSONObject.fromObject(result).toString());
		return;
	}
	
	/**
	 * 用户注销
	 * @param model
	 * @param session
	 */
	@RequestMapping(value="/logout")
	public void signout_page(Model model,
			HttpServletResponse response,
			HttpSession session) {
		session.invalidate();
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("result", 1);
		super.ajaxReturn(response, JSONObject.fromObject(map).toString());
	}
	
	/**
	 * 后台管理页面
	 * @param model
	 * @param session
	 * @return
	 */
	@RequestMapping("/index")
	public String index(Model model, HttpSession session) {
		UserInfo user = (UserInfo) session.getAttribute(C.ADMIN_SESSION_KEY);
		List<Menu> menuList = (List<Menu>) session.getAttribute(C.MENU_KEY);
		model.addAttribute("user", user);
		model.addAttribute("menu", menuList);
		List<String> list = new ArrayList<String>();
		list.add("首页");
		model.addAttribute("pathname", list);
		return "admin/index";
	}
	
	/**
	 * 用户界面
	 * @param model
	 * @param session
	 * @return
	 */
	@RequestMapping("/user")
	public String userPage(Model model, HttpSession session){
		UserInfo user = (UserInfo) session.getAttribute(C.ADMIN_SESSION_KEY);
		List<Menu> menuList = (List<Menu>) session.getAttribute(C.MENU_KEY);
		List<UserInfo> userList = iuserInfoService.selectAllUserLowerMe(user);
		model.addAttribute("user", user);
		model.addAttribute("menu", menuList);
		model.addAttribute("userlist", userList);
		/*增加路径显示信息*/
		List<String> list = new ArrayList<String>();
		list.add("首页");
		list.add("用户管理");
		model.addAttribute("pathname", list);
		return "admin/user";
	}
}
