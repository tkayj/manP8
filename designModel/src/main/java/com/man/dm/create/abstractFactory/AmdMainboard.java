/**
 * 
 */
package com.man.dm.create.abstractFactory;

/**
 * @author KE
 *
 */
public class AmdMainboard implements Mainboard {
	private int cpuHoles=0;
	
	public AmdMainboard(int cupHoles) {
		this.cpuHoles=cupHoles;
	}
	
	public void installCPU() {		
		System.out.println("AMD主板的CPU插槽孔数是：" + cpuHoles);
	}

}
