package com.learn.Spring_Boot_AOP.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginAspect {

	@Before("execution(* com.learn.Spring_Boot_AOP.service.*.*())")
	public void beforeMethod()
	{
		System.out.println("before before code================");
	}

	
	@After("execution(* com.learn.Spring_Boot_AOP.service.*.*())")
	public void afterMethod()
	{
		System.out.println("after after code================");
	}
}
