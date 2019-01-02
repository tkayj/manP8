package com.man.dm.create.prototype2;

public class ConcretePrototype1 implements Prototype{

	private String name;
	
	public Prototype clone() {
		ConcretePrototype1 prototype=new ConcretePrototype1();
		prototype.setName(this.getName());
		return prototype;
	}
	
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		this.name=name;
	}

}
