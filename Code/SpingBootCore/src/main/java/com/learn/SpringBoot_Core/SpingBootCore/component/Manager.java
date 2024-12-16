package com.learn.SpringBoot_Core.SpingBootCore.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.learn.SpringBoot_Core.SpingBootCore.service.LoginService;

@Component
public class Manager {
 
	//3 types.

//	1. field injection
//	@Autowired
//	Employee employee;
	
	Employee employee;

//	2. Constructor injection.
//@Autowired  is optional from latest spring boot versions
//	public Manager(Employee employee) {
//		super();
//		this.employee = employee;
//	}

	
	@Autowired
	@Qualifier("mysql")
	LoginService loginService;
	
	public void completeTask()
	{
		System.out.println("Manager will complete task: 3");
		employee.doWork();
		loginService.doLogin();
		loginService.doLogout();
		
	}

	public Employee getEmployee() {
		return employee;
	}

//	3. Setter injection
	@Autowired
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
