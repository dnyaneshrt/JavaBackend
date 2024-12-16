package com.learn.springtest.spring_core1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.springtest.spring_core1.components.Car;
import com.learn.springtest.spring_core1.components.Engine;
import com.learn.springtest.spring_core1.components.Wheel;
import com.learn.springtest.spring_core1.config.AppConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to first Spring core example" );
//        Car car=new Car();  //Tight coupled
//        car.drive();
        
        
//     ApplicationContext applicationContext=   new ClassPathXmlApplicationContext("com/learn/springtest/spring_core1/config.xml");
//     Car car=applicationContext.getBean(Car.class);
//     Engine engine=applicationContext.getBean(Engine.class);
     ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
        
     Wheel wheel=applicationContext.getBean(Wheel.class);
     Engine engine=applicationContext.getBean(Engine.class);
     
//     car.drive();
//     System.out.println(car);
     System.out.println(engine);
     System.out.println(wheel);
     
     
    }
}
