package com.man.spring.bean.annotation.respository;

import org.springframework.stereotype.Repository;

@Repository("userRespository")
public class UserRespositoryImpl implements UserRespository{

	@Override
	public void save() {
		System.out.println("UserRespository save");
	}

}
