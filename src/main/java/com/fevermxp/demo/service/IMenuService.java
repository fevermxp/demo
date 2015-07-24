package com.fevermxp.demo.service;

import java.util.List;

import com.fevermxp.demo.entity.Menu;

public interface IMenuService {
	List<Menu> listAllMenu();
	List<Menu> listAllParentMenu();
	List<Menu> listSubMenuByParentId(Integer parentId);
	Menu getMenuById(Integer menuId);
	void saveMenu(Menu menu);
	void deleteMenuById(Integer menuId);
	List<Menu> listAllSubMenu();
}
