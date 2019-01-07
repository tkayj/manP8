package com.man.dm.struct.decorator;

/**
 * 装饰器接口，维持一个指向组件对象的接口对象，并定义一个与组件接口一致的接口
 * @author KE
 *
 */
public class Decorator extends Component{
		
	protected Component component;
	
	public Decorator(Component component) {
		this.component=component;
	}

	@Override
	public void operation() {
		
		//转发请求给组件对象，可以在转发前后执行一些附件动作
		component.operation();
	}

}
