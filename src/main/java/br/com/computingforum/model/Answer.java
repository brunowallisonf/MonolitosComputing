package br.com.computingforum.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity(name="answers")
public class Answer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_answer;
	
	@NotNull
	private String text;
	
	@ManyToOne
	@JoinColumn(name="qid")
	private Question question;
	
	@ManyToOne
	@JoinColumn(name="username")
	private User author;
	
	@Min(0)
	@Max(5)
	private int evaluation;

	public long getId_answer() {
		return id_answer;
	}

	public void setId_answer(long id_answer) {
		this.id_answer = id_answer;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public int getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(int evaluation) {
		this.evaluation = evaluation;
	}
	
	
	
}
