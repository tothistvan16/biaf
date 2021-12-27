package com.web.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


import org.springframework.stereotype.Component;

@Entity
@Component
public class Hour {
	
	
	@GeneratedValue
	@Id
	private Long id;
	private String hour;
	public Hour(Long id, String hour) {
		super();
		this.id = id;
		this.hour = hour;
	}
	public Hour() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getHour() {
		return hour;
	}
	public void setHour(String hour) {
		this.hour = hour;
	}
	@Override
	public String toString() {
		return "Hour [id=" + id + ", hour=" + hour + "]";
	}
	
	
	
	
}