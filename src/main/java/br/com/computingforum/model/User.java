package br.com.computingforum.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.jboss.logging.Message;

@Entity(name="users")
public class User {
	@Id
	@Pattern(regexp = "([a-z]|[A-Z]|[0-9])+")
	private String username;
	
	private String bio;
	
	@Pattern(regexp="([a-z]|[A-Z]+) ([a-z]|[A-Z]+)")
	private String fullname;
	
	@Pattern(regexp = "([a-z]|[A-Z]|[0-9])+")
	private String password;
	
	@Email
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
