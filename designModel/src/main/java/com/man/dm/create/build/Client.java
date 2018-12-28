package com.man.dm.create.build;

public class Client {
     public static void main(String[] args) {
		Builder builder=new ConcreteBuilder();		
		Director d=new Director(builder);
		d.construct();		
		Product product=builder.retrieveResult();
		System.out.println(product.getPart1());
		System.out.println(product.getPart2());
	}
}
