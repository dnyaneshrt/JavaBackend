package com.learn.Spring_Boot_AOP.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserAspect {
	
	@Before("execution(* com.learn.Spring_Boot_AOP.service.UserService.*(String,String))")
	public void beforeMethod()
	{
		System.out.println("before:login");
	}
	@After("execution(* com.learn.Spring_Boot_AOP.service.UserService.*(String,String))")
	public void afterMethod()
	{
		System.out.println("after:logout");
	}
	
	@Around("execution(* com.learn.Spring_Boot_AOP.service.UserService.*(String,String))")
	public void validateUser(ProceedingJoinPoint joinPoint) throws Throwable
	{
		String username=joinPoint.getArgs()[0].toString();
		String password=joinPoint.getArgs()[1].toString();
		if(username.equals("Amit")&&password.equals("Java@123"))
		{
			System.out.println("Welcome User-------");
			joinPoint.proceed();
		}else
		{
			System.out.println("invalid user..");
		}
	}

}
