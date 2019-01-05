package com.man.dm.struct.bridge;

public class CommonMessage extends AbstractMessage{

	public CommonMessage(MessageImplementor message) {
		super(message);		
	}
	
	public void sendMessage(String message,String toUser) {
		super.sendMessage(message, toUser);
	}

}
