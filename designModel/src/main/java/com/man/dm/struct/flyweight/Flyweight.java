package com.man.dm.struct.flyweight;

public interface Flyweight {
	
	/**
	 * 判断传入的安全实体和权限，是否和享元对象内部状态匹配
	 * @param securityEntity 安全实体
	 * @param permit 权限
	 * @return  true 匹配，false 不匹配
	 */
	public boolean match(String securityEntity,String permit);
}
