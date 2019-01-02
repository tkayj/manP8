package com.man.dm.create.singleton;

public class LazySingLeton {
	
	private static LazySingLeton instance=null;
	
	/**
	 * 私有默认构造子
	 */
	private LazySingLeton() {}
	
	/**
	 * 静态工厂方法
	 * @return
	 */
	public static synchronized LazySingLeton getInstance() {
		if(instance==null) {
			instance=new LazySingLeton();
		}
		return instance;
	}
	
}
