package com.zensar.spring.instruments;

import org.springframework.stereotype.Component;
@Component("guitar")
public class Guitar implements Instrument {
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Guitar sound--ting ting ting ting ting ting");

	}

}
