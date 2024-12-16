package com.learn.SpringBoot_Core.SpingBootCore.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
//@Primary
public class NewDBService  implements LoginService {

	@Override
	public void doLogin() {
	System.out.println("Employee is logging in...");
	System.out.println("Logged in with :NewDBService");
		
	}

	@Override
	public void doLogout() {
		System.out.println("Employee is logging out...");
		System.out.println("Logged out with :NewDBService");
	}

}
