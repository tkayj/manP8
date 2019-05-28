package com.man.spring.bean.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.man.spring.bean.annotation.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	public void execute() {
		System.out.println("UserController execute");
		userService.add();
	}

}
