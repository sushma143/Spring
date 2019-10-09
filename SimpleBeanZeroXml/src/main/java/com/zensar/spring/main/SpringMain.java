package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zensar.spring.Greeting;
import com.zensar.spring.config.GreetingConfig;

public class SpringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(GreetingConfig.class);
		Greeting greeting=ctx.getBean("festival",Greeting.class);
		System.out.println(greeting.greet());
		Greeting greetings=ctx.getBean("anniversaryGreeting",Greeting.class);
		System.out.println(greetings.greet());
		
	}

}
