package com.man.spring.bean.annotation.respository;

import org.springframework.stereotype.Repository;

@Repository
public class UserJdbcRespository implements UserRespository{

	@Override
	public void save() {
		System.out.println("UserJdbcRespository save");
		
	}

}
