package com.man.spring.bean.annotation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.man.spring.bean.annotation.respository.UserRespository;

@Service
public class UserService {
		
	private UserRespository userRespository;
	
	@Autowired
	private List<UserRespository> userRespositorys;
	
	public void setUserRespository(UserRespository userRespository) {
		this.userRespository = userRespository;
	}

	public void add() {
		System.out.println("userService add");
//		userRespository.save();
		
		for(UserRespository userRepository:userRespositorys) {
			userRepository.save();
		}		
	}
}
