package com.ceshi.gmall.service.impl;

import java.util.List;

import com.ceshi.bean.UserAddress;
import com.ceshi.service.UserService;

public class UserServiceStub implements UserService {
	
	private final UserService userService;
	

	/**
	 * 浼犲叆鐨勬槸userService杩滅▼鐨勪唬鐞嗗璞�
	 * @param userService
	 */
	public UserServiceStub(UserService userService) {
		super();
		this.userService = userService;
	}


	public List<UserAddress> getUserAddressList(String userId) {
		// TODO Auto-generated method stub
		System.out.println("UserServiceStub.....");
		//if(!StringUtils.isEmpty(userId)) {
			return userService.getUserAddressList(userId);
		//}
		//return null;
	}

}