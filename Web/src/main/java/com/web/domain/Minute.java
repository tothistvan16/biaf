package com.web.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


import org.springframework.stereotype.Component;

@Entity
@Component
public class Minute {
	
	
	@GeneratedValue
	@Id
	private Long id;
	private String minute;
	public Minute(Long id, String minute) {
		super();
		this.id = id;
		this.minute = minute;
	}
	public Minute() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMinute() {
		return minute;
	}
	public void setMinute(String minute) {
		this.minute = minute;
	}
	@Override
	public String toString() {
		return "Minute [id=" + id + ", minute=" + minute + "]";
	}
	
	
}