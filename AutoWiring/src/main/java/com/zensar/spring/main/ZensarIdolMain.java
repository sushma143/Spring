package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.config.PerformerConfig;
import com.zensar.spring.instruments.Instrument;
import com.zensar.spring.performers.Performer;

public class ZensarIdolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new AnnotationConfigApplicationContext(PerformerConfig.class);
		Performer p=ctx.getBean("aahana",Performer.class);
		p.perform();
		Instrument p1=ctx.getBean("guitar",Instrument.class);
		p1.play();
	
		

	}

}
