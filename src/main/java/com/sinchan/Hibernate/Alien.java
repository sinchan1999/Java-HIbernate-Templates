package com.sinchan.Hibernate;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.*;

// For Second Level cache
import org.hibernate.annotations.Cache;  
import org.hibernate.annotations.CacheConcurrencyStrategy;  

@Entity
//For Second Level cache
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)  
public class Alien //POJO
{
	@Id
	private int alienId;
	private String alienName;
	private String alienColor;
	
	//This an embedded class
	private Certificate certi;
	
	
	public int getAlienId() {
		return alienId;
	}
	public void setAlienId(int alienId) {
		this.alienId = alienId;
	}
	public String getAlienName() {
		return alienName;
	}
	public void setAlienName(String alienName) {
		this.alienName = alienName;
	}
	public String getAlienColor() {
		return alienColor;
	}
	public void setAlienColor(String alienColor) {
		this.alienColor = alienColor;
	}
	
	// Getter and Setter for Certificates
	public Certificate getCerti() {
		return certi;
	}
	public void setCerti(Certificate certi) {
		this.certi = certi;
	}
	
	
	
	

}
