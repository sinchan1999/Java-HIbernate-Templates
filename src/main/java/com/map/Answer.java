package com.map;



import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer {
	
	@Id
	
	private int answerId;
	private String answer;
	
	// Getters and Setters
	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	// Constructor using fields
	public Answer(int answerId, String answer) {
		super();
		this.answerId = answerId;
		this.answer = answer;
	}
	
	// Constructor using Super Class
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
