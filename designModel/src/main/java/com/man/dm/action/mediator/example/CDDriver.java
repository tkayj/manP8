package com.man.dm.action.mediator.example;

public class CDDriver extends Colleague{

	public CDDriver(Mediator mediator) {
		super(mediator);
	}
	
	private String data="";
	
	public String getData() {
		return this.data;
	}
	
	public void readCD() {
		//都要
		this.data="设计模式，值得好好研究";
		this.getMediator().changed(this);
	}
	
}
