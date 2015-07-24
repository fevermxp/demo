package com.fevermxp.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fevermxp.demo.common.C;
import com.fevermxp.demo.entity.Menu;
import com.fevermxp.demo.entity.UserInfo;

@Controller
public class IndexController {

	@RequestMapping(value = "index")
	public String helloWorld(Model model, HttpSession session){
		UserInfo user = (UserInfo) session.getAttribute(C.SESSION_KEY);
		List<Menu> menuList = (List<Menu>) session.getAttribute(C.MENU_KEY);
		model.addAttribute("user", user);
		model.addAttribute("menu", menuList);
		return "index";
	}
}
