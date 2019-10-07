package com.zensar.spring.performer;

public class Juggler implements Performer {
	private int beanBags;
	public Juggler() {
		// TODO Auto-generated constructor stub
		System.out.println("No argument Constructor of juggler class.");
	}
	

	public Juggler(int beanBags) {
		super();
		this.beanBags = beanBags;
		System.out.println("Parameterized Constructor of juggler class.");
	}

	
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Juggler juggling Bean bags"+beanBags);

	}

}
