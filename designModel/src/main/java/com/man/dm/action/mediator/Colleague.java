package com.man.dm.action.mediator;

/**
 * 同事类的抽象父类（中介者模式）
 * @author KE
 *
 */
public abstract class Colleague {

	/**
	 * 持有中介者对象，每一个同事类都知道它的中介者对象
	 */
	private Mediator mediator;
	
	/**
	 * 构造方法，传入中介者对象
	 * @param mediator
	 */
	public Colleague(Mediator mediator) {
		this.mediator=mediator;
	}
	
	/**
	 * 获取当前同事类对应的中介者对象
	 * @return
	 */
	public Mediator getMediator() {
		return mediator;
	}
}
