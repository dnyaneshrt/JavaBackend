package com.learn.Spring_Boot_AOP.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public void login() throws InterruptedException {
		System.out.println("user is logging in....");
		Thread.sleep(2000);
		System.out.println("user logged in successfully!!!");
	}
	
	public void logout() throws InterruptedException {
		System.out.println("user is logging out....");
		Thread.sleep(2000);
		System.out.println("user logged out successfully!!!");
	}
}
