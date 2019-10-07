package com.zensar.spring;

public class FestivalGreeting implements Greeting {

	@Override
	public String greet() {
		// TODO Auto-generated method stub
		return "Happy Work Day(Dusshera)";
	}
	public FestivalGreeting() {
		// TODO Auto-generated constructor stub
		System.out.println("FestivalGreeting is created");
	}

}
