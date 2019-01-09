package com.man.dm.struct.proxy.simple;

public class Proxy implements Subject{

	private Subject subject=null;
	
	
	public Proxy(Subject subject) {
		this.subject=subject;
	}
	
	@Override
	public void request() {
		//调用执行之前执行逻辑
		System.out.println("调用执行之前执行逻辑");
		subject.request();
		//调用执行之后执行逻辑		
		System.out.println("调用执行之后执行逻辑");
	}

}
