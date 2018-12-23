/**
 * 
 */
package com.man.dm.create.abstractFactory;

/**
 * @author KE
 *
 */
public class IntelMainboard implements Mainboard {
	private int cpuHoles=0;
	
	public IntelMainboard(int cupHoles) {
		this.cpuHoles=cupHoles;
	}
	
	public void installCPU() {		
		System.out.println("Intel主板的CPU插槽孔数是：" + cpuHoles);
	}

}
