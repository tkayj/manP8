package com.man.dm.action.proxy;

public class Proxy implements Subject{

	private Subject subject;
	
	public Proxy( Subject subject) {
		this.subject=subject;
	}
	
	@Override
	public void request() {		
		System.out.println("=====start==========");
		subject.request();
		System.out.println("=====end==========");		
	}

}
