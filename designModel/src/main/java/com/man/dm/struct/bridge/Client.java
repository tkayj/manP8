package com.man.dm.struct.bridge;

public class Client {
	
	public static void main(String[] args) {
		
		MessageImplementor smsMsg=new MessageSMS();
		AbstractMessage message=new UrgencyMessage(smsMsg);
		message.sendMessage("信息内容", "张三");
		
		message=new CommonMessage(smsMsg);
		message.sendMessage("信息内容", "张三");
				
		MessageImplementor mobileMsg=new MessageMobile();
		message=new UrgencyMessage(mobileMsg);
		message.sendMessage("信息内容", "张三");
	}	
}
