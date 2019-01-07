package com.man.dm.struct.decorator;

/**
 * 具体实现组件对象接口的对象
 * @author KE 
 */
public class ConcreteComponent extends Component{

	@Override
	public void operation() {
		//相应的功能处理
		System.out.println("--原处理方法---");
	}

}
