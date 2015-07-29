package com.fevermxp.demo.service;

import java.util.List;

import com.fevermxp.demo.entity.UserInfo;

public interface IUserInfoService {
	
	public int getCountUser();

	public boolean selectUserByLogin(String trim);

	public UserInfo selectUserByUser(UserInfo user);

	public List<UserInfo> selectAllUserLowerMe(UserInfo user);
}

