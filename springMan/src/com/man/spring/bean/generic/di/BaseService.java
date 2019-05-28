package com.man.spring.bean.generic.di;

import org.springframework.beans.factory.annotation.Autowired;

//泛型依赖注入
public class BaseService<T> {
	
	@Autowired
	private BaseRepository<T> baseRepository;
	
	public void add() {
		System.out.println("BaseService add...");
		baseRepository.save();
		System.out.println(baseRepository);
	}

}
