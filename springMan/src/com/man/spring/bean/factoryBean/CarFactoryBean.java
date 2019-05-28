package com.man.spring.bean.factoryBean;

import org.springframework.beans.factory.FactoryBean;

//自定义的FactoryBean 需要实现FactoryBean 接口
public class CarFactoryBean implements FactoryBean<Car>{

	private String brand;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	
	@Override
	public Car getObject() throws Exception {		
		return new Car(brand,30000);
	}

	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}

	
}
