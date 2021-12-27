package com.web.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


import org.springframework.stereotype.Component;

@Entity
@Component
public class Month {
	
	
	@GeneratedValue
	@Id
	private Long id;
	private String month;
	private String monthstr;
	public Month(Long id, String month, String monthstr) {
		super();
		this.id = id;
		this.month = month;
		this.monthstr = monthstr;
	}
	public Month() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getMonthstr() {
		return monthstr;
	}
	public void setMonthstr(String monthstr) {
		this.monthstr = monthstr;
	}
	@Override
	public String toString() {
		return "Month [id=" + id + ", month=" + month + ", monthstr=" + monthstr + "]";
	}
	
	
	
	
}