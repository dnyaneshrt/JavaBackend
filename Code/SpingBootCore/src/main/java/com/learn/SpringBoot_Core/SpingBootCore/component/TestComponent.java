package com.learn.SpringBoot_Core.SpingBootCore.component;

import org.springframework.stereotype.Component;

//to make this class as spring bean @Component

@Component
public class TestComponent {

	public void test()
	{
		System.out.println("testing method");
	}
}
