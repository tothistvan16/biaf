package com.web.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


import org.springframework.stereotype.Component;

@Entity
@Component
public class Year {
	
	
	@GeneratedValue
	@Id
	private Long id;
	private String year;
	public Year(Long id, String year) {
		super();
		this.id = id;
		this.year = year;
	}
	public Year() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Year [id=" + id + ", year=" + year + "]";
	}
	
	
	
	
	
	
	
	
}
