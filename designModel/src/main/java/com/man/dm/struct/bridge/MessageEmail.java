package com.man.dm.struct.bridge;

public class MessageEmail implements MessageImplementor{

	@Override
	public void send(String message, String toUser) {
		System.out.println("以邮件的方式发送消息："+message+" toUser:"+toUser);		
	}

}
