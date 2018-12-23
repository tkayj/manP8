package com.man.dm.create.abstractFactory;

public class IntelFactory implements AbstractFactory {

	public Cpu createCpu() {	      
		return new IntelCpu(755);
	}

	public Mainboard createMainboard() {
		return new IntelMainboard(755);
	}

}
