package com.man.spring.bean.factory;

import java.util.HashMap;
import java.util.Map;

public class StaticCarFactory {
	
	private static Map<String,Car> map= new HashMap<String,Car>();
			
	static {
		map.put("audi", new Car("audi",300000));
		map.put("ford", new Car("ford",300000));
	}
	public static Car getCar(String name) {
		return map.get(name);
	}

}
