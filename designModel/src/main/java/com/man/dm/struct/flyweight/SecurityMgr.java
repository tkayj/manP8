package com.man.dm.struct.flyweight;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SecurityMgr {

	private static SecurityMgr securityMgr=new SecurityMgr();
	
	private SecurityMgr() {}
	
	public static SecurityMgr getInstance() {
		return securityMgr;		
	}
	
	/**
	 * 
	 */
	private Map<String,Collection<Flyweight>> map=new HashMap<String,Collection<Flyweight>>();
	
	
	public void login(String user) {
		//登录时就需要把该用户所拥有的权限，从数据库中取出来，放到缓存中去
	}
}
