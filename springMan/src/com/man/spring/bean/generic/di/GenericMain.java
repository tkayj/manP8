package com.man.spring.bean.generic.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GenericMain {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans-generic-di.xml");
		UserService userService=(UserService)ctx.getBean("userService");
		userService.add();
	}
}
