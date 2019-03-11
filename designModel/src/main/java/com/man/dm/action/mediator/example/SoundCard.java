package com.man.dm.action.mediator.example;

public class SoundCard extends Colleague{

	public SoundCard(Mediator mediator) {
		super(mediator);
	}
	
	
	public void soundData(String data) {
		System.out.println("您正观看的是："+data);
	}
	
}
