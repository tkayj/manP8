package com.man.dm.struct.decorator;

public class Client {

	public static void main(String[] args) {
		
		Component com=new ConcreteComponent();
		Decorator dec=new ConcreteDecoratorA(com);
		dec.operation();

	}

}
