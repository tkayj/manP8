package com.man.dm.struct.component;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{
	
	private List<Component> childComponents =null;
	
	public void someOperation() {
		System.out.println("枝干节点");
		if(childComponents!=null) {
			for(Component c:childComponents) {
				//递归地进行子组件相应方法的调用
				c.someOperation();
			}
		}
	}	
	
	/**
	 * 像组合对象中加入组件对象
	 * @param child   组件对象
	 */
	public void addChild(Component child) {		
		
		if(childComponents==null) {
			childComponents=new ArrayList<Component>();
		}
		childComponents.add(child);
	}
	
	/**
	 * 从组合对象中移除某个组件对象
	 * @param component
	 */
	public void remove(Component component) {
		if(childComponents!=null) {
			childComponents.remove(component);
		}
	}
	
	public Component getChildren(int index) {
		if(childComponents!=null) {
			if(index>=0 && index<childComponents.size()) {
				return childComponents.get(index);
			}
		}
		return null;
	}
}
