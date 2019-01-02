package com.man.dm.create.prototype1;

public class ConcretePrototype2 implements Prototype {
	
	public Object clone() {
		Prototype protoType=new ConcretePrototype2();
		return protoType;	
	}

}
