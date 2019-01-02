package com.man.dm.create.prototype2;

public class ConcreatePrototype2 implements Prototype {

	private String name;
	
	public Prototype clone() {
		
		ConcreatePrototype2 prototype=new ConcreatePrototype2();
		prototype.setName(this.getName());
		return prototype;
		
	}
	
	@Override
	public String getName() {
		
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name=name;		
	}

}
