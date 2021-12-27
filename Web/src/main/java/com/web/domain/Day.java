package com.web.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


import org.springframework.stereotype.Component;

@Entity
@Component
public class Day {
	
	
	@GeneratedValue
	@Id
	private Long id;
	private String day;
	public Day(Long id, String day) {
		super();
		this.id = id;
		this.day = day;
	}
	public Day() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	@Override
	public String toString() {
		return "Day [id=" + id + ", day=" + day + "]";
	}
	
	
}
