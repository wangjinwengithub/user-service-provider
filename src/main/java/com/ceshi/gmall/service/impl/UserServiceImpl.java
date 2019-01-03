package com.ceshi.gmall.service.impl;

import java.util.Arrays;
import java.util.List;

import com.ceshi.bean.UserAddress;
import com.ceshi.service.UserService;

public class UserServiceImpl implements UserService {

	public List<UserAddress> getUserAddressList(String userId) {
		System.out.println("UserServiceImpl.....old...");
		// TODO Auto-generated method stub
		UserAddress address1 = new UserAddress(1, "入巷间，吃汤面", "1", "道将行", "010-56253825", "Y");
		UserAddress address2 = new UserAddress(2, "没那么简单，就能找到聊得来的伴", "1", "没那么简单", "010-56253825", "N");
		/*try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		return Arrays.asList(address1,address2);
	}

}
