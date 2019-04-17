package com.man.dm.action.proxy;

public class RealSubject implements Subject{

	@Override
	public void request() {
		
		System.out.println("具体方法实现！");
	}

}
