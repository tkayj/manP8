package com.man.dm.create.build2;

import java.util.Date;

public class Director {
	Builder builder;
	
	
	public Director(Builder builder) {
		this.builder=builder;
	}
	
	public void construct(String toAddress,String fromAddress) {
		
		this.builder.buildFrom(fromAddress);
		this.builder.buildSubject();
		this.builder.buildTo(toAddress);
		this.builder.buildBody();
		this.builder.buildSendDate(new Date());
		this.builder.sendMessage();
		
	}
	
}
