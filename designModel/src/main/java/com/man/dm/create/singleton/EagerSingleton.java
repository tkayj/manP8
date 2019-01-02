package com.man.dm.create.singleton;

/**
 * 饿汉式单例类
 * @author tiank
 *
 */
public class EagerSingleton {

	/**
	 * 私有默认构造子
	 */
	private static EagerSingleton instance=new EagerSingleton();
	
	private EagerSingleton() {}
	
	/**
	 * 静态工厂方法
	 * @return
	 */
	public static EagerSingleton getInstance() {
		return instance;
	}
	
}
