package com.sinchan.Hibernate;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
	private String course;
	private String duration;
	
	//Getters and Setters
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// Constructor using Feilds
	public Certificate(String course, String duration) {
		super();
		this.course = course;
		this.duration = duration;
	}	

}
