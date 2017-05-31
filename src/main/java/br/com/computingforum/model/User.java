package br.com.computingforum.model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="users")
public class User {
	@Id
	private String username;
	
	private String bio;
	
	private String fullname;
	
	private String password;
	
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
