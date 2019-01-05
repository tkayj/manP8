package com.man.dm.struct.bridge;

public class MessageSMS implements MessageImplementor{

	@Override
	public void send(String message, String toUser) {
		System.out.println("以站内信的方式发送消息："+message+" toUser:"+toUser);		
	}

}
