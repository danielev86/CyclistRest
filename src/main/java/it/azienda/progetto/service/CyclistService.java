package it.azienda.progetto.service;

import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import it.azienda.progetto.front.bean.CyclistDTO;
import it.azienda.progetto.hibernate.bean.Cyclist;
import it.azienda.progetto.stubdata.CyclistDataStub;
import it.progetto.azienda.converter.CyclistConverter;

@Service("services.cyclist")
public class CyclistService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	@Qualifier("cyclistConverter")
	private CyclistConverter conversion;
	
	public List<CyclistDTO> retrieveAllCyclist() throws ParseException{
		List<CyclistDTO> cyclists = new ArrayList<>();
		for (Cyclist cyclist:CyclistDataStub.generateAllCyclist()){
			cyclists.add(conversion.convert(cyclist));	
		}
		return cyclists;
	}

}
