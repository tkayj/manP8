package com.man.dm.action.mediator.example;

public abstract class Colleague {

	private Mediator mediator;
	
	public Colleague(Mediator mediator) {
		this.mediator=mediator;
	}
	
	public Mediator getMediator() {
		return mediator;
	}
	
}
