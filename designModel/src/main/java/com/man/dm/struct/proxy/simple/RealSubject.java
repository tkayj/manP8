package com.man.dm.struct.proxy.simple;

public class RealSubject implements Subject{

	@Override
	public void request() {
		System.out.println("执行具体的功能。");		
	}

}
