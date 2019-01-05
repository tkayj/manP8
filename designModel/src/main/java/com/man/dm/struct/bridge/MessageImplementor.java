package com.man.dm.struct.bridge;

/**
 * 实现发送消息的统一接口
 * @author KE
 *
 */
public interface MessageImplementor {

	/**
	 * 发送消息
	 * @param message 内容
	 * @param toUser 用户
	 */
	public void send(String message,String toUser);
}
