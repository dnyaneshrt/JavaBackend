package com.learn.SpringBoot_Core.SpingBootCore.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("mysql")
public class MySQL_LoginService implements LoginService {

	@Override
	public void doLogin() {
	System.out.println("Employee is logging in...");
	System.out.println("Logged in with :MySQL_LoginService");
		
	}

	@Override
	public void doLogout() {
		System.out.println("Employee is logging out...");
		System.out.println("Logged out with :MySQL_LoginService");
	}

}
