package com.zensar.spring.performers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.zensar.spring.instruments.Instrument;
@Component("aahana")
public class Instrumentalist implements Performer {
	@Autowired
	@Qualifier("guitar")
	private Instrument instrument;
	@Value("Dil chahta hai")
	private String song;
	@Value("Shan")
	private String name;
	
	
	
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Instrumentalist "+name+" , is playing a song "+song);
		instrument.play();
	}

}
