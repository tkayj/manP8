package com.man.dm.create.abstractFactory;

public class AmdCpu implements Cpu {

	private int pins=0;
	
	public AmdCpu(int pins) {
		this.pins=pins;		
	}
	
	public void calculate() {
		System.out.println("AMD cpu 针脚数："+pins);
	}

}
