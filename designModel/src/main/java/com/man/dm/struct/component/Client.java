package com.man.dm.struct.component;

public class Client {
	
	public static void main(String[] args) {
		
		Component root=new Composite();
		Component c1=new Composite();
		Component c2=new Composite();
		
		Component left1=new Leaf();
		Component left2=new Leaf();
		Component left3=new Leaf();
		
		root.addChild(c1);
		root.addChild(c2);
		root.addChild(left1);
		c1.addChild(left2);
		c2.addChild(left3);
				
		root.someOperation();
	}

}
