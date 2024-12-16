package com.learn.springtest.spring_core1.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.learn.springtest.spring_core1.components.Wheel;

@Configuration
@ComponentScan(basePackages = "com.learn.springtest.spring_core1.components")
public class AppConfig {

	@Bean
	public Wheel wheel()
	{
		return new Wheel();
	}	

}
