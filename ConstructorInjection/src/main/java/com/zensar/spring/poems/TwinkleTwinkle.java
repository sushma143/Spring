package com.zensar.spring.poems;

public class TwinkleTwinkle implements Poem {
	
	private static final String LINES[]= {
			"Twinkle Twinkle little star",
			"how I wonder what you are",
			"up above the world so high",
			"like a diamond in the sky"
	};

	@Override
	public void recite() {
		// TODO Auto-generated method stub
		for(String li:LINES)
		{
			System.out.println(li);
		}
	}

}
