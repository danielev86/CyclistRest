package it.azienda.progetto.hibernate.bean;

import java.io.Serializable;
import java.util.Set;

public interface Team extends Serializable {

	public Integer getId();

	public void setId(Integer id);

	public String getTeamName();

	public void setTeamName(String teamName);

	public Set<Cyclist> getCyclists();

	public void setCyclists(Set<Cyclist> cyclists);

}
