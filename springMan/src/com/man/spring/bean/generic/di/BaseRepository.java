package com.man.spring.bean.generic.di;

//泛型依赖注入
public class BaseRepository<T> {
	
	protected void save() {
		System.out.println("BaseRespository save");
	}

}
