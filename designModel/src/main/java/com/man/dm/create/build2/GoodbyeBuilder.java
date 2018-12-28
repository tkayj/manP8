package com.man.dm.create.build2;

public class GoodbyeBuilder extends Builder{
	
	public GoodbyeBuilder() {
		msg=new GoodbyeMessage();
	}

	@Override
	public void buildBody() {
		msg.setBody("欢送内容");		
	}

	@Override
	public void buildSubject() {
		msg.setSubject("欢送标题");		
	}

}
