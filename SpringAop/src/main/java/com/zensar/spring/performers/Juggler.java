package com.zensar.spring.performers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.zensar.spring.exceptions.PerformanceException;
@Component("annonyms")
public class Juggler implements Performer {
	@Value("1")
	private int beanBags;

	@Override
	public void perform() throws PerformanceException {
		// TODO Auto-generated method stub
		if(beanBags<3)
			throw new PerformanceException("You need improvement because you are juggling with less than 3 bags.");
		else
			System.out.println("Juggler is juggling "+beanBags+" bags");

	}

}
