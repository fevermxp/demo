package com.fevermxp.demo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fevermxp.demo.dao.MenuMapper;
import com.fevermxp.demo.entity.Menu;
import com.fevermxp.demo.entity.MenuExample;
import com.fevermxp.demo.service.IMenuService;

@Service
public class MenuServiceImpl implements IMenuService {

	@Resource
	MenuMapper menuMapper;
	
	public void deleteMenuById(Integer menuId) {
		// TODO Auto-generated method stub
		menuMapper.deleteByPrimaryKey(menuId);
	}

	public Menu getMenuById(Integer menuId) {
		// TODO Auto-generated method stub
		return menuMapper.selectByPrimaryKey(menuId);
	}

	public List<Menu> listAllParentMenu() {
		// TODO Auto-generated method stub
		MenuExample me = new MenuExample();
		me.createCriteria().andParentIdIsNull();
		return menuMapper.selectByExample(me);
	}

	public void saveMenu(Menu menu) {
		// TODO Auto-generated method stub
		if(menu.getMenuId()!=null && menu.getMenuId().intValue()>0){
			menuMapper.updateByPrimaryKeySelective(menu);
		}else{
			menuMapper.insert(menu);
		}
	}

	public List<Menu> listSubMenuByParentId(Integer parentId) {
		// TODO Auto-generated method stub
		MenuExample me = new MenuExample();
		me.createCriteria().andParentIdEqualTo(parentId);
		return menuMapper.selectByExample(me);
	}
	
	public List<Menu> listAllMenu() {
		// TODO Auto-generated method stub
		List<Menu> rl = this.listAllParentMenu();
		for(Menu menu : rl){
			List<Menu> subList = this.listSubMenuByParentId(menu.getMenuId());
			menu.setSubMenu(subList);
			menu.setSubCount(subList.size());
		}
		return rl;
	}

	public List<Menu> listAllSubMenu(){
		return menuMapper.listAllSubMenu();
	}
	
	public MenuMapper getMenuMapper() {
		return menuMapper;
	}

	public void setMenuMapper(MenuMapper menuMapper) {
		this.menuMapper = menuMapper;
	}
}
