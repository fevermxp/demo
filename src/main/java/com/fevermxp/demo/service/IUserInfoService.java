package com.fevermxp.demo.service;

import com.fevermxp.demo.entity.UserInfo;

public interface IUserInfoService {
	
	public int getCountUser();

	public boolean selectUserByLogin(String trim);

	public UserInfo selectUserByUser(UserInfo user);
}

