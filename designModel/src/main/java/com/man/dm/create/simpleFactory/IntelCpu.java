package com.man.dm.create.simpleFactory;

public class IntelCpu implements Cpu {

	private int pins=0;
	
	public IntelCpu(int pins) {
		this.pins=pins;		
	}
	
	public void calculate() {
		System.out.println("intel cpu 针脚数："+pins);
	}

}
