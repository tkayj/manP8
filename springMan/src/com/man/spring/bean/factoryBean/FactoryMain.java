package com.man.spring.bean.factoryBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryMain {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans-beanfactory.xml");
		Car car1=(Car)ctx.getBean("car1");
		System.out.println(car1);
		
	}
}
