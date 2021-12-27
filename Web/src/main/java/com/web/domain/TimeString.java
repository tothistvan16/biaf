package com.web.domain;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;


@Component
public class TimeString {
	
	
	private String starttimestr;
	private String stoptimestr;
	public TimeString(String starttimestr, String stoptimestr) {
		super();
		this.starttimestr = starttimestr;
		this.stoptimestr = stoptimestr;
	}
	public TimeString() {
		super();
	}
	public String getStarttimestr() {
		return starttimestr;
	}
	public void setStarttimestr(String starttimestr) {
		this.starttimestr = starttimestr;
	}
	public String getStoptimestr() {
		return stoptimestr;
	}
	public void setStoptimestr(String stoptimestr) {
		this.stoptimestr = stoptimestr;
	}
	@Override
	public String toString() {
		return "TimeString [starttimestr=" + starttimestr + ", stoptimestr=" + stoptimestr + "]";
	}
	
	

}
