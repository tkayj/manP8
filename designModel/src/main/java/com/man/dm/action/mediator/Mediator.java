package com.man.dm.action.mediator;

/**
 * 中介者，定义各个同事对象通信的接口（中介者模式）
 * @author KE
 *
 */
public interface Mediator {
	
	/**
	 * 同事对象在自身改变的时候来通知中介者的方法
	 * @param colleague
	 */
	public void changed(Colleague colleague);

}
