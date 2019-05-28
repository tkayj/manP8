package com.man.spring.aop.impl;


import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
@Aspect
public class ValidateAspect {
	
	//不同包下需要写包名
	@Before("com.man.spring.aop.impl.LoggingAspect.declareJoinPointExpression()")
	public void before(JoinPoint joinPoint) {
		System.out.println("validate Aspect args:"+Arrays.asList(joinPoint.getArgs()));
	}
	
}
