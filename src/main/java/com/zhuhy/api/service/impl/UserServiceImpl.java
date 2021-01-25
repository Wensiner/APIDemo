package com.zhuhy.api.service.impl;

import org.springframework.stereotype.Service;

import com.zhuhy.api.entity.User;
import com.zhuhy.api.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Override
	public String addUser(User user) {
		 // 直接编写业务逻辑
        return "success";
	}

}
