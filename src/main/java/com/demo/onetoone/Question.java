package com.demo.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Question {
	
	@Id
	private int questionId;
	private String question;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Answer answerObj;
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Question(int questionId, String question, Answer answerObj) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answerObj = answerObj;
	}

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
	public Answer getAnswerObj() {
		return answerObj;
	}
	public void setAnswerObj(Answer answerObj) {
		this.answerObj = answerObj;
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question + ", answerObj=" + answerObj + "]";
	}
	
	
	

}
