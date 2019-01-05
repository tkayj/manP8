package com.man.dm.struct.bridge;

public class MessageMobile implements MessageImplementor{

	@Override
	public void send(String message, String toUser) {
		System.out.println("以手机短信的方式发送消息："+message+" toUser:"+toUser);		
	}

}
