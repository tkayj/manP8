package com.man.dm.struct.bridge;

public class UrgencyMessage extends AbstractMessage{

	public UrgencyMessage(MessageImplementor message) {
		super(message);		
	}
	
	public void sendMessage(String message,String toUser) {
		message="《加急》"+message;
		super.sendMessage(message, toUser);
	}
	
	/**
	 * 扩展自己的功能，监控某消息的处理过程
	 * @param messageId
	 * @return
	 */
	public Object watch(String messageId) {
		
		return null;
	}

}
