package com.man.spring.aop.helloworld;

public class Main {
	public static void main(String[] args) {
		
		ArithmeticCalculator target=new ArithmeticCalculatorImpl();
		
		ArithmeticCalculator proxy=new ArithmeticCalculatorLoggingProxy(target).getLoggingProxy();
		
		proxy.add(3, 2);
		
		proxy.mul(3, 2);
	}

}
