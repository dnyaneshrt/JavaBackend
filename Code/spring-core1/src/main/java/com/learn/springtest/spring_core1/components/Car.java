package com.learn.springtest.spring_core1.components;

public class Car {

	Engine engine=new Engine(); ///Tight coupled
	
	Wheel wheel=new Wheel();
	
	public void drive() {
	engine.start();
	System.out.println("car is driving");
	wheel.use();
	}

}
