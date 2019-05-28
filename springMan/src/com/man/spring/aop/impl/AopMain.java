package com.man.spring.aop.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

	public static void main(String[] args) {
		
		//1.创建spring IOC 容器
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2.从IOC容器中，获取bean 实例
		ArithmeticCalculator calc=(ArithmeticCalculator)ctx.getBean(ArithmeticCalculator.class);
		
		//3. 使用bean
		int result=0;	
		
		try {
			//前置通知
			result=calc.div(3, 1);
			//返回通知，可以访问到方法的返回值
		} catch (Exception e) {
			//异常通知，可以访问到方法返回的异常
			e.printStackTrace();
		}
		//后置通知，因为方法可能会出异常，索引访问不到返回值。
		
		System.out.println("result:"+result);
				
	}
}
