package com.learn.Spring_Boot_AOP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.learn.Spring_Boot_AOP.service.LoginService;
import com.learn.Spring_Boot_AOP.service.ProductService;
import com.learn.Spring_Boot_AOP.service.UserService;

@SpringBootApplication
public class SpringBootAopApplication {

	public static void main(String[] args) throws InterruptedException {
	 ConfigurableApplicationContext applicationContext=	SpringApplication.run(SpringBootAopApplication.class, args);
//	 LoginService loginService= applicationContext.getBean(LoginService.class);
//	 loginService.login();
//	 loginService.logout();
//	 
//	 ProductService productService= applicationContext.getBean(ProductService.class);
//	 productService.showProducts();
	 
	 UserService userService= applicationContext.getBean(UserService.class);
	 userService.showUser("Navin", "Java@123"); //instance method calling..
	
	}

}
