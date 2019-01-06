package com.man.dm.struct.facade;

public class Facade {

	/**
	 * 满足客户需要的功能
	 */
	public void test() {
		AModuleApi a=new AModuleApiImpl();
		a.testA();
		BModuleApi b=new BModuleApiImpl();
		b.testB();
		CModuleApi c=new CModuleApiImpl();
		c.testC();
		
	}
}
