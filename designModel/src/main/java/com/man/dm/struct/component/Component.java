package com.man.dm.struct.component;

/**
 * 抽象的组件对象，为组合中的对象声明接口，实现接口的缺省行为
 * @author tiank
 *
 */
public abstract class Component {
		
	public abstract void someOperation();
	
	/**
	 * 像组合对象中加入组件对象
	 * @param child   组件对象
	 */
	public void addChild(Component child) {		
		
		//缺省的实现，抛出例外，因为叶子对象没有这个功能
		//或者子组件没有实现这个功能
		throw new UnsupportedOperationException("对象不支持这个功能");
	}
	
	/**
	 * 从组合对象中移除某个组件对象
	 * @param component
	 */
	public void remove(Component component) {
		
		//缺省的实现，抛出例外，因为叶子对象没有这个功能
		//或者子组件没有实现这个功能
		throw new UnsupportedOperationException("对象不支持这个功能");
	}
	
	public Component getChildren(int index) {
		//缺省的实现，抛出例外，因为叶子对象没有这个功能
		//或者子组件没有实现这个功能
		throw new UnsupportedOperationException("对象不支持这个功能");
	}
	
}
