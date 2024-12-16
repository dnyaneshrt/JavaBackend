package com.learn.SpringBoot_Core.SpingBootCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import com.learn.SpringBoot_Core.SpingBootCore.component.Employee;
import com.learn.SpringBoot_Core.SpingBootCore.component.Manager;
import com.learn.SpringBoot_Core.SpingBootCore.component.TestComponent;
import com.learn.SpringBoot_Core.SpingBootCore.service.LoginService;

@SpringBootApplication
public class SpingBootCoreApplication implements CommandLineRunner{

	@Autowired
	TestComponent component;
	
	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext=SpringApplication.run(SpingBootCoreApplication.class, args);
//		Employee employee= configurableApplicationContext.getBean(Employee.class);
//		System.out.println(employee);
//		
	Manager manager= configurableApplicationContext.getBean(Manager.class);
	manager.completeTask();
		
//	LoginService loginService=configurableApplicationContext.getBean(LoginService.class);
//	loginService.doLogin();
//	loginService.doLogout();
		

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("--------------------------");
		component.test();
		
	}

}
