package com.web.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Entity
@Component

public class Authentication {
	
	@GeneratedValue
	@Id
	private Long id;
	private String csoport;
	private String csoportcode;
	private String password;
	private String name;
	private String email;
	private int fromgroup;
	private int togroup;
	public Authentication(Long id, String csoport, String csoportcode, String password, String name, String email,
			int fromgroup, int togroup) {
		super();
		this.id = id;
		this.csoport = csoport;
		this.csoportcode = csoportcode;
		this.password = password;
		this.name = name;
		this.email = email;
		this.fromgroup = fromgroup;
		this.togroup = togroup;
	}
	public Authentication() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCsoport() {
		return csoport;
	}
	public void setCsoport(String csoport) {
		this.csoport = csoport;
	}
	public String getCsoportcode() {
		return csoportcode;
	}
	public void setCsoportcode(String csoportcode) {
		this.csoportcode = csoportcode;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getFromgroup() {
		return fromgroup;
	}
	public void setFromgroup(int fromgroup) {
		this.fromgroup = fromgroup;
	}
	public int getTogroup() {
		return togroup;
	}
	public void setTogroup(int togroup) {
		this.togroup = togroup;
	}
	@Override
	public String toString() {
		return "Authentication [id=" + id + ", csoport=" + csoport + ", csoportcode=" + csoportcode + ", password="
				+ password + ", name=" + name + ", email=" + email + ", fromgroup=" + fromgroup + ", togroup=" + togroup
				+ "]";
	}
	
	
	
	
	
	

}
