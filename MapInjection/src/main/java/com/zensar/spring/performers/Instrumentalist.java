package com.zensar.spring.performers;

import java.util.Map;

import com.zensar.spring.instruments.Instrument;

public class Instrumentalist implements Performer {
	
	private Map<Instrument, String> instrumentSongMap;
	
	public Map<Instrument, String> getInstrumentSongMap() {
		return instrumentSongMap;
	}

	public void setInstrumentSongMap(Map<Instrument, String> instrumentSongMap) {
		this.instrumentSongMap = instrumentSongMap;
	}
	
	
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Instrument is playing songs ");
		 for (Map.Entry<Instrument,String> entry : instrumentSongMap.entrySet())  
		 { System.out.println("song played " + entry.getValue() + 
	                             ",by  " );
		 
		  entry.getKey().play();}
		
	}

	

}
