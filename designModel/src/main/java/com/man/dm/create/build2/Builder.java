package com.man.dm.create.build2;

import java.util.Date;

public abstract class Builder {

	protected AutoMessage msg;
	
	public abstract void buildBody();
	public abstract void buildSubject();
	
	public void buildFrom(String from ) {
		msg.setFrom(from);
	};
	
	public void buildTo(String to) {
		msg.setTo(to);
	}
	
	public void buildSendDate(Date sendDate) {
		msg.setSendDate(sendDate);;
	}
	
	public void sendMessage() {
		msg.send();
	}
	
	
}
