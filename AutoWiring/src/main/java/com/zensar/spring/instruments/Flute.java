package com.zensar.spring.instruments;

import org.springframework.stereotype.Component;

@Component
public class Flute implements Instrument {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Flute is playing ");
	}

}
