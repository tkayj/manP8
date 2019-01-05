package com.man.dm.struct.bridge;

/**
 * 抽象的消息对象
 * @author KE
 *
 */
public abstract class AbstractMessage {
	
	/**
	 * 持有一个实现部分的消息
	 */
	protected MessageImplementor message;
	
	/**
	 * 构造
	 * @param message
	 */
	public AbstractMessage(MessageImplementor message) {
		this.message=message;
	}
	
	/**
	 * 发送消息，转调实现部分的方法
	 * @param message
	 * @param toUser
	 */
	public void sendMessage(String message,String toUser) {
		this.message.send(message, toUser);
	}
	
}
