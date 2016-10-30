package it.azienda.progetto.stubdata;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import it.azienda.progetto.hibernate.bean.Cyclist;
import it.azienda.progetto.hibernate.bean.impl.CyclistImpl;

public class CyclistDataStub {
	
	public static List<Cyclist> generateAllCyclist() throws ParseException{
		List<Cyclist> cyclists = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Cyclist c1 = new CyclistImpl();
		c1.setId(1);
		c1.setFirstName("Vincenzo");
		c1.setLastName("Nibali");
		c1.setBorn(sdf.parse("14/11/1984"));
		c1.setPhotoUrl("https://it.wikipedia.org/wiki/Vincenzo_Nibali#/media/File:Cambrai_-_Tour_de_France,_%C3%A9tape_4,_7_juillet_2015,_arriv%C3%A9e_(B43)_(cropped).JPG");
		Cyclist c2 = new CyclistImpl();
		c2.setId(2);
		c2.setFirstName("Fabio");
		c2.setLastName("Aru");
		c2.setBorn(sdf.parse("03/07/1990"));
		c2.setPhotoUrl("https://upload.wikimedia.org/wikipedia/commons/6/64/Fabio_Aru_Red_Jersey_-_Vuelta_a_Espa%C3%B1a_2015.JPG");
		cyclists.add(c1);
		cyclists.add(c2);
		return cyclists;
	}

}
