package com.man.dm.struct.decorator;

public class ConcreteDecoratorB extends Decorator{

	public ConcreteDecoratorB(Component component) {
		super(component);		
	}
		
	private void otherMethod() {
		//执行逻辑
	}
		
	public void operation() {
		//执行其他方法
		this.otherMethod();
		//调用父类的方法，可以在调用前后执行一些附件动作
		super.operation();
	}

}
