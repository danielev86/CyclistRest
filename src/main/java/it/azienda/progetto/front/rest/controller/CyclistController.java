package it.azienda.progetto.front.rest.controller;

import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.azienda.progetto.front.bean.CyclistDTO;
import it.azienda.progetto.service.CyclistService;

@RestController
public class CyclistController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	@Qualifier("services.cyclist")
	private CyclistService cyclistService;
	
	@RequestMapping("/retrieveAllCyclist")
	public ResponseEntity<List<CyclistDTO>>  retrieveAllCyclist(){
		List<CyclistDTO> result =  new ArrayList<>();
		try {
			result = cyclistService.retrieveAllCyclist();
		} catch (ParseException e) {
			return new ResponseEntity<List<CyclistDTO>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<CyclistDTO>>(result, HttpStatus.OK);
	}
}
