package com.ceshi.gmall.service.impl;

import java.util.Arrays;
import java.util.List;

import com.ceshi.bean.UserAddress;
import com.ceshi.service.OrderService2;

public class OrderServiceImpl implements OrderService2{

	public List<UserAddress> initOrder(String userId) {
		UserAddress address1 = new UserAddress(1, "����䣬������", "1", "������", "010-56253825", "Y");
		UserAddress address2 = new UserAddress(2, "û��ô�򵥣������ҵ��ĵ����İ�", "1", "û��ô��", "010-56253825", "N");
		UserAddress address3= new UserAddress(3, "������������ѩ���㣬��ƶҲ����", "1", "��������", "010-56253825", "N");
		return Arrays.asList(address1,address2,address3);
	}

}
