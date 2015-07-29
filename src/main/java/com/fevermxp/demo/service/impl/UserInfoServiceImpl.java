package com.fevermxp.demo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fevermxp.demo.dao.UserInfoMapper;
import com.fevermxp.demo.entity.UserInfo;
import com.fevermxp.demo.entity.UserInfoExample;
import com.fevermxp.demo.service.IUserInfoService;

@Service
public class UserInfoServiceImpl implements IUserInfoService {

	@Resource
	UserInfoMapper userInfoMapper;
	
	public int getCountUser() {
		UserInfoExample ue = new UserInfoExample();
		return userInfoMapper.countByExample(ue);
	}

	@Override
	public boolean selectUserByLogin(String login) {
		UserInfoExample ue = new UserInfoExample();
		ue.createCriteria().andLoginEqualTo(login);
		Integer count = userInfoMapper.countByExample(ue);
		if(count>0){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public UserInfo selectUserByUser(UserInfo user) {
		UserInfoExample ue = new UserInfoExample();
		ue.createCriteria().andLoginEqualTo(user.getLogin().trim());
		List<UserInfo> users = userInfoMapper.selectByExample(ue);
		return users.get(0);
	}

	@Override
	public List<UserInfo> selectAllUserLowerMe(UserInfo user) {
		UserInfoExample ue = new UserInfoExample();
		ue.createCriteria().andUsertypeLessThanOrEqualTo(user.getUsertype());
		return userInfoMapper.selectByExample(ue);
	}
}

