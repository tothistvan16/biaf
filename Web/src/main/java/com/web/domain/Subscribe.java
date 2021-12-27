package com.web.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Subscribe {
	
	@GeneratedValue
	@Id
	private Long id;
	private String lastname; //vezetéknév
	private String firstname; //keresztnév
	private String email;
	public Subscribe(Long id, String lastname, String firstname, String email) {
		super();
		this.id = id;
		this.lastname = lastname;
		this.firstname = firstname;
		this.email = email;
	}
	public Subscribe() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Subscribe [id=" + id + ", lastname=" + lastname + ", firstname=" + firstname + ", email=" + email + "]";
	}
	
	
	
	

}
