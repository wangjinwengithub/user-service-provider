package com.ceshi.gmall.service.impl;

import java.util.Arrays;
import java.util.List;

import com.ceshi.bean.UserAddress;
import com.ceshi.service.OrderService2;

public class OrderServiceImpl implements OrderService2{

	public List<UserAddress> initOrder(String userId) {
		UserAddress address1 = new UserAddress(1, "入巷间，吃汤面", "1", "道将行", "010-56253825", "Y");
		UserAddress address2 = new UserAddress(2, "没那么简单，就能找到聊得来的伴", "1", "没那么简单", "010-56253825", "N");
		UserAddress address3= new UserAddress(3, "往后余生，冬雪是你，清贫也是你", "1", "往后余生", "010-56253825", "N");
		return Arrays.asList(address1,address2,address3);
	}

}
