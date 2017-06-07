package br.com.computingforum.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;





@Entity(name="questions")
public class Question {
	@Id
	private long id_question;
	
	@ManyToOne
	@JoinColumn(name="username")
	private User user;
	@NotNull
	private String title;
	@NotNull
	private String text;
	@NotNull
	private category category;
	
	public long getId_question() {
		return id_question;
	}
	public void setId_question(long id_question) {
		this.id_question = id_question;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public category getCategory() {
		return category;
	}
	public void setCategory(category category) {
		this.category = category;
	}
	
	
}
