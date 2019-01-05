package com.man.dm.struct.adapter;

/**
 * 类适配
 * @author KE
 *
 */
public class AdapterClass extends Adaptee implements Target {

	/**
	 * 由于源类Adaptee没有方法sampleOperation2() 因此适配器补充上这个方法
	 */
	@Override
	public void sampleOperation2() {		
		// 写相关的代码
	}

}
