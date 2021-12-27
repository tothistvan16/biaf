package com.web.domain;

import org.springframework.stereotype.Component;

@Component
public class Datestring {
	
	String syear;
	String smonth;
	String sday;
	String shour;
	String sminute;
	String ssec;
	String eyear;
	String emonth;
	String eday;
	String eshour;
	String eminute;
	String esec;
	public Datestring(String syear, String smonth, String sday, String shour, String sminute, String ssec, String eyear,
			String emonth, String eday, String eshour, String eminute, String esec) {
		super();
		this.syear = syear;
		this.smonth = smonth;
		this.sday = sday;
		this.shour = shour;
		this.sminute = sminute;
		this.ssec = ssec;
		this.eyear = eyear;
		this.emonth = emonth;
		this.eday = eday;
		this.eshour = eshour;
		this.eminute = eminute;
		this.esec = esec;
	}
	public Datestring() {
		super();
	}
	public String getSyear() {
		return syear;
	}
	public void setSyear(String syear) {
		this.syear = syear;
	}
	public String getSmonth() {
		return smonth;
	}
	public void setSmonth(String smonth) {
		this.smonth = smonth;
	}
	public String getSday() {
		return sday;
	}
	public void setSday(String sday) {
		this.sday = sday;
	}
	public String getShour() {
		return shour;
	}
	public void setShour(String shour) {
		this.shour = shour;
	}
	public String getSminute() {
		return sminute;
	}
	public void setSminute(String sminute) {
		this.sminute = sminute;
	}
	public String getSsec() {
		return ssec;
	}
	public void setSsec(String ssec) {
		this.ssec = ssec;
	}
	public String getEyear() {
		return eyear;
	}
	public void setEyear(String eyear) {
		this.eyear = eyear;
	}
	public String getEmonth() {
		return emonth;
	}
	public void setEmonth(String emonth) {
		this.emonth = emonth;
	}
	public String getEday() {
		return eday;
	}
	public void setEday(String eday) {
		this.eday = eday;
	}
	public String getEshour() {
		return eshour;
	}
	public void setEshour(String eshour) {
		this.eshour = eshour;
	}
	public String getEminute() {
		return eminute;
	}
	public void setEminute(String eminute) {
		this.eminute = eminute;
	}
	public String getEsec() {
		return esec;
	}
	public void setEsec(String esec) {
		this.esec = esec;
	}
	@Override
	public String toString() {
		return "Datestring [syear=" + syear + ", smonth=" + smonth + ", sday=" + sday + ", shour=" + shour
				+ ", sminute=" + sminute + ", ssec=" + ssec + ", eyear=" + eyear + ", emonth=" + emonth + ", eday="
				+ eday + ", eshour=" + eshour + ", eminute=" + eminute + ", esec=" + esec + "]";
	}
	
	
	
	
	
	
	
	

}
