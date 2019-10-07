package com.zensar.spring.performer;

import com.zensar.spring.poems.Poem;

public class PoeticJuggler extends Juggler {
	private Poem poem;
	public PoeticJuggler() {
		// TODO Auto-generated constructor stub
		System.out.println("No argument constructor of Poetic Juggler class.");
	}
	public PoeticJuggler(int beanBags, Poem poem) {
		super(beanBags);
		this.poem = poem;
		System.out.println("Parameterized constructor of Poect Juggler class.");
	}
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		super.perform();
		System.out.println("While reciting a poem....");
		poem.recite();
	}
	
	
}
