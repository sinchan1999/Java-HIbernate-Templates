package com.map;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Question {
	
	@Id	
	
	private int questionId;
	private String question;
	
	// ------>>>>OnetoOne>>>>-------
	
	/* @OneToOne
	@JoinColumn(name="answer_id") // Renaming the join column (Foreign key) in Question Table
	private Answer answer;

	// Getters and Setters
	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	//Constructor using fields
	public Question(int questionId, String question, Answer answer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answer = answer;
	}

	
	// Constructor using Super Class
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	} 
    */
	
	
	//-------------->>>>>OneToMany<<<<<<<----------------	
	
    @OneToMany(mappedBy="question")
	private List<Answer> answers;

	// Getters and Setters
	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

    
	// Getters and Setters for List
		
	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	
	
	// Constructor using fields

	public Question(int questionId, String question, List<Answer> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
	
		
	}
	
	
	
	
	
	
	


