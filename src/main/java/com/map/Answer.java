package com.map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	
	@Id	
	private int answerId;
	private String answer;
	
	
	// ------>>>>OnetoOne>>>>-------
	
	/* @OneToOne(mappedBy="answer") // It means question will take care of the Bi-directional mapping and will display once in question table
	private Question question;
	
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
	
	
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
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
	 */
	
	
	//-------------->>>>>OneToMany<<<<<<<----------------	
	
	@ManyToOne
	private Question question;
	
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
	
	
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
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
