package com.man.dm.create.abstractFactory;

public class AmdFactory implements AbstractFactory {

	public Cpu createCpu() {	      
		return new AmdCpu(938);
	}
	
	public Mainboard createMainboard() {
		return new AmdMainboard(938);
	}
	
}
