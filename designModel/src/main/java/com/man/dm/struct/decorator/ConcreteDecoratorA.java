package com.man.dm.struct.decorator;

public class ConcreteDecoratorA extends Decorator{

	public ConcreteDecoratorA(Component component) {
		super(component);		
	}
		
	private String addStatus;
		
	public void operation() {
		//增加更新addStatus逻辑
		System.out.println("----更新状态----");
		this.setAddStatus("更新状态");
		//调用父类的方法，可以在调用前后执行一些附件动作		
		super.operation();
	}
		
	public String getAddStatus() {
		return addStatus;
	}

	public void setAddStatus(String addStatus) {
		this.addStatus = addStatus;
	}
}
