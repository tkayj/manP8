package com.man.dm.action.mediator;

/**
 * 具体同事类（中介者模式）
 * @author KE
 *
 */
public class ConcreteColleagueB extends Colleague {

	public ConcreteColleagueB(Mediator mediator) {
		super(mediator);		
	}
	
	public void someOperation() {
		getMediator().changed(this);
	}

}
