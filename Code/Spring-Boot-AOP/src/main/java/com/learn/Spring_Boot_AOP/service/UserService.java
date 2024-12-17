package com.learn.Spring_Boot_AOP.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	
	public void showUser(String username, String password)
	{
		System.out.println("Welcome :"+username);
		System.out.println("password :"+password);
		
	}

}
