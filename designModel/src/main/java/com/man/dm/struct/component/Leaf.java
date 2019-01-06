package com.man.dm.struct.component;

public class Leaf extends Component{
	
	/**
	 * 叶子对象可有有自己的功能方法
	 */
	@Override
	public void someOperation() {
		System.out.println("--叶子节点--");		
	}

}
