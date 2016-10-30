package it.azienda.progetto.front.bean;

import java.io.Serializable;
import java.util.Set;

public class TeamDTO implements Serializable {


	private static final long serialVersionUID = 1L;
	private Integer id;
	private String teamName;
	private Set<CyclistDTO> cyclists;

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

	public Set<CyclistDTO> getCyclists() {
		return cyclists;
	}

	public void setCyclists(Set<CyclistDTO> cyclists) {
		this.cyclists = cyclists;
	}

}
