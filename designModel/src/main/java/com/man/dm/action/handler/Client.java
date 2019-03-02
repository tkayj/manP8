package com.man.dm.action.handler;

public class Client {
	
	public static void main(String[] args) {
		Handler h1=new GeneralManager();
		Handler h2=new DeptManager();
		Handler h3=new ProjectHandler();	
		
		h3.setSuccessor(h2);
		h2.setSuccessor(h1);	
		
		String test=h3.handleFeeRequest("张三", 300);
		System.out.println(test);		
		test=h3.handleFeeRequest("李四", 300);
		System.out.println(test);
		
		test=h3.handleFeeRequest("张三", 700);
		System.out.println(test);		
		test=h3.handleFeeRequest("李四", 700);
		System.out.println(test);
		
		test=h3.handleFeeRequest("张三", 1000);
		System.out.println(test);		
		test=h3.handleFeeRequest("李四", 1000);
		System.out.println(test);
	}
}
