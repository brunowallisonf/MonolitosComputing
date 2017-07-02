package br.com.computingforum.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.jboss.logging.Message;

@Entity(name="users")
public class User {
	@Id
	@Pattern(regexp = "([a-z]|[A-Z]|[0-9])+",message="Padrao inexperado,somente letras e numeros sem espacos")
	
	private String username;
	
	private String bio;
	
	private String fullname;
	@NotEmpty(message="Senha vazia")
	@NotNull
	private String password;
	
	@Column(unique=true)
	@Email
	@NotEmpty(message="Email nao pode estar vazio")
	private String email;
	
	private Boolean isAdmin;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Boolean getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	

}
