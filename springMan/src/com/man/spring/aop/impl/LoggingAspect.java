package com.man.spring.aop.impl;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//把这个类声明为一个切面：需要把该类放入到Ioc容器中，再声明为一个切面。
@Order(2) //指定切面的优先级，按顺序执行，值越小，优先级越高
@Component
@Aspect
public class LoggingAspect {
	
	/**
	 * 定义一个方法，用于声明切入点表达式，一般地，该方法中再不需要填入其他的代码
	 * 使用@Pointcut 声明切入点表达式
	 * 后面的其他通知直接使用方法名来引入当前的切入点表达式 
	 */
	@Pointcut("execution(* com.man.spring.aop.impl.*.*(..))")
	public void declareJoinPointExpression() {}

	//声明该方法是一个前置通知，在目标方法开始之前执行
	@Before("declareJoinPointExpression()")
	public void beforeMethod(JoinPoint joinPoint) {		
		String methodName=joinPoint.getSignature().getName();
		List<Object> args=Arrays.asList(joinPoint.getArgs());
		
		System.out.println("the method " + methodName + " begin"+ args);
	}
	
	//后置通知：在目标方法执行后（无论是否发生异常），执行的通知。
	//在后置通知中，还不能访问目标方法访问的结果
	@After("declareJoinPointExpression()")
	public void afterMethod(JoinPoint joinPoint) {
		String methodName=joinPoint.getSignature().getName();
		List<Object> args=Arrays.asList(joinPoint.getArgs());
		
		System.out.println("the method " + methodName + " ends");
	}
	
	//在方法正常结束后执行的代码
	//返回通知可以访问到方法的返回值
	@AfterReturning(value="declareJoinPointExpression()",returning="result")
	public void afterReturning(JoinPoint joinPoint,Object result) {
		String methodName=joinPoint.getSignature().getName();
		List<Object> args=Arrays.asList(joinPoint.getArgs());
		
		System.out.println("the method " + methodName + " end with:"+result);
	}
	
	//在目标方法出现异常时，会执行的代码
	//可以访问到异常对象；且可以在出现特定异常时，再执行通知代码
	@AfterThrowing(value="declareJoinPointExpression()",throwing="ex")
	public void afterThrowing(JoinPoint joinPoint,Exception ex) {
		String methodName=joinPoint.getSignature().getName();
		List<Object> args=Arrays.asList(joinPoint.getArgs());
		
		System.out.println("the method " + methodName + " ocuurs Exception:"+ex);
	}
	
	/**
	 * 环绕通知需携带ProceedingJoinPoint类型的参数(了解）
	 * 环绕通知类似于动态代理的全过程：ProceedingJoinPoint 类型的参数，可以决定是否执行目标方法
	 * 切环绕通知必须有返回值，返回值即为目标方法的返回值
	 * @param prj
	 */
	@Around("declareJoinPointExpression()")
	public Object arroundMethod(ProceedingJoinPoint prj) {		
		Object result=null;
		
		try {
			//前置通知
			System.out.println("the method "+prj.getSignature().getName()+" args:"+prj.getArgs());
			//执行目标方法	
			result=prj.proceed();
			//返回通知
			System.out.println("the method "+prj.getSignature().getName()+" result："+result);
			
		} catch (Throwable e) {			
			//异常通知
			System.out.println("the method "+prj.getSignature().getName()+" occur exception:"+e);
			throw new RuntimeException(e);
		}
		System.out.println("the method "+prj.getSignature().getName()+" ends");
		
		return 100;
	}
}
