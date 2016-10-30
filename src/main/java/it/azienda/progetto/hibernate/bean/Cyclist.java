package it.azienda.progetto.hibernate.bean;

import java.io.Serializable;
import java.util.Date;

public interface Cyclist extends Serializable {

	public Integer getId();

	public void setId(Integer id);

	public String getFirstName();

	public void setFirstName(String firstName);

	public String getLastName();

	public void setLastName(String lastName);

	public Date getBorn();

	public void setBorn(Date born);
	
	public String getPhotoUrl();
	
	public void setPhotoUrl(String photoUrl);

	@Override
	public int hashCode();

	@Override
	public boolean equals(Object obj);

}
