package com.zensar.spring.performers;

import java.util.Enumeration;
import java.util.Properties;

public class Instrumentalist implements Performer {

		private Properties instrumentSongProps;
	public Properties getInstrumentSongProps() {
			return instrumentSongProps;
		}
		public void setInstrumentSongProps(Properties instrumentSongProps) {
			this.instrumentSongProps = instrumentSongProps;
		}
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		Enumeration instrument=instrumentSongProps.keys();
		while(instrument.hasMoreElements()) {
			String instrumentName=(String) instrument.nextElement();
			String song=instrumentSongProps.getProperty(instrumentName);
			System.out.println(song+" played by "+instrumentName);
			System.out.println("Instrument is playing song");
		}
	}
	
	

	

}
