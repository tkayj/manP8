package com.man.dm.create.prototype1;

public class ConcretePrototype1 implements Prototype{
	
	public Object clone() {
		Prototype protoType=new ConcretePrototype1();
		return protoType;	
	}

}
