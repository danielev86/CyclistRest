package it.azienda.progetto.hibernate.bean.impl;

import java.util.Set;

import it.azienda.progetto.hibernate.bean.Cyclist;
import it.azienda.progetto.hibernate.bean.Team;

public class TeamImpl implements Team {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String teamName;
	private Set<Cyclist> cyclists;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public Set<Cyclist> getCyclists() {
		return cyclists;
	}

	public void setCyclists(Set<Cyclist> cyclists) {
		this.cyclists = cyclists;
	}

}
