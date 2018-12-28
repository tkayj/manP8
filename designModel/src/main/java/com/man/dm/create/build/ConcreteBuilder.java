package com.man.dm.create.build;

public class ConcreteBuilder implements Builder{

	private Product product=new Product();
		
	@Override
	public void buildPart1() {
		product.setPart1("编号:xxxx");
	}

	@Override
	public void buildPart2() {
		product.setPart2("名称：XXXXX");
		
	}

	@Override
	public Product retrieveResult() {	
		return product;
	}

}
