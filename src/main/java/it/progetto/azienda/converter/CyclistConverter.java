package it.progetto.azienda.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import it.azienda.progetto.front.bean.CyclistDTO;
import it.azienda.progetto.hibernate.bean.Cyclist;

@Component("cyclistConverter")
public class CyclistConverter implements Converter<Cyclist, CyclistDTO> {

	@Override
	public CyclistDTO convert(Cyclist source) {
		CyclistDTO target = new CyclistDTO();
		target.setId(source.getId());
		target.setFirstName(source.getFirstName());
		target.setLastName(source.getLastName());
		target.setBorn(source.getBorn());
		target.setPhotoUrl(source.getPhotoUrl());
		return target;
	}

}
