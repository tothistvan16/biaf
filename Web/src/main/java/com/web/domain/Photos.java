package com.web.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Photos {
	
	@GeneratedValue
	@Id
	private Long id;
	private String csoport;
	private int csoportkepszam;
	private String photourl = "https://biafoto.hu/images/"; //https://biafoto.hu/images/a/csoport_a-1.jpg
	private String photourlweb;
	private int startnumberstr;
	private int stopnumberstr;
	private String photoname;
	private String note;
	private boolean bol;
	private int m_9x13;
	private int m_10x13;
	private int m_10x15;
	private int m_13x18;
	private int m_15x20;
	private int m_28x24;
	private int m_20x30;
	private int m_30x40;
	private int m_30x45;
	public Photos(Long id, String csoport, int csoportkepszam, String photourl, String photourlweb, int startnumberstr,
			int stopnumberstr, String photoname, String note, boolean bol, int m_9x13, int m_10x13, int m_10x15,
			int m_13x18, int m_15x20, int m_28x24, int m_20x30, int m_30x40, int m_30x45) {
		super();
		this.id = id;
		this.csoport = csoport;
		this.csoportkepszam = csoportkepszam;
		this.photourl = photourl;
		this.photourlweb = photourlweb;
		this.startnumberstr = startnumberstr;
		this.stopnumberstr = stopnumberstr;
		this.photoname = photoname;
		this.note = note;
		this.bol = bol;
		this.m_9x13 = m_9x13;
		this.m_10x13 = m_10x13;
		this.m_10x15 = m_10x15;
		this.m_13x18 = m_13x18;
		this.m_15x20 = m_15x20;
		this.m_28x24 = m_28x24;
		this.m_20x30 = m_20x30;
		this.m_30x40 = m_30x40;
		this.m_30x45 = m_30x45;
	}
	public Photos() {
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
	public int getCsoportkepszam() {
		return csoportkepszam;
	}
	public void setCsoportkepszam(int csoportkepszam) {
		this.csoportkepszam = csoportkepszam;
	}
	public String getPhotourl() {
		return photourl;
	}
	public void setPhotourl(String photourl) {
		this.photourl = photourl;
	}
	public String getPhotourlweb() {
		return photourlweb;
	}
	public void setPhotourlweb(String photourlweb) {
		this.photourlweb = photourlweb;
	}
	public int getStartnumberstr() {
		return startnumberstr;
	}
	public void setStartnumberstr(int startnumberstr) {
		this.startnumberstr = startnumberstr;
	}
	public int getStopnumberstr() {
		return stopnumberstr;
	}
	public void setStopnumberstr(int stopnumberstr) {
		this.stopnumberstr = stopnumberstr;
	}
	public String getPhotoname() {
		return photoname;
	}
	public void setPhotoname(String photoname) {
		this.photoname = photoname;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public boolean isBol() {
		return bol;
	}
	public void setBol(boolean bol) {
		this.bol = bol;
	}
	public int getM_9x13() {
		return m_9x13;
	}
	public void setM_9x13(int m_9x13) {
		this.m_9x13 = m_9x13;
	}
	public int getM_10x13() {
		return m_10x13;
	}
	public void setM_10x13(int m_10x13) {
		this.m_10x13 = m_10x13;
	}
	public int getM_10x15() {
		return m_10x15;
	}
	public void setM_10x15(int m_10x15) {
		this.m_10x15 = m_10x15;
	}
	public int getM_13x18() {
		return m_13x18;
	}
	public void setM_13x18(int m_13x18) {
		this.m_13x18 = m_13x18;
	}
	public int getM_15x20() {
		return m_15x20;
	}
	public void setM_15x20(int m_15x20) {
		this.m_15x20 = m_15x20;
	}
	public int getM_28x24() {
		return m_28x24;
	}
	public void setM_28x24(int m_28x24) {
		this.m_28x24 = m_28x24;
	}
	public int getM_20x30() {
		return m_20x30;
	}
	public void setM_20x30(int m_20x30) {
		this.m_20x30 = m_20x30;
	}
	public int getM_30x40() {
		return m_30x40;
	}
	public void setM_30x40(int m_30x40) {
		this.m_30x40 = m_30x40;
	}
	public int getM_30x45() {
		return m_30x45;
	}
	public void setM_30x45(int m_30x45) {
		this.m_30x45 = m_30x45;
	}
	@Override
	public String toString() {
		return "Photos [id=" + id + ", csoport=" + csoport + ", csoportkepszam=" + csoportkepszam + ", photourl="
				+ photourl + ", photourlweb=" + photourlweb + ", startnumberstr=" + startnumberstr + ", stopnumberstr="
				+ stopnumberstr + ", photoname=" + photoname + ", note=" + note + ", bol=" + bol + ", m_9x13=" + m_9x13
				+ ", m_10x13=" + m_10x13 + ", m_10x15=" + m_10x15 + ", m_13x18=" + m_13x18 + ", m_15x20=" + m_15x20
				+ ", m_28x24=" + m_28x24 + ", m_20x30=" + m_20x30 + ", m_30x40=" + m_30x40 + ", m_30x45=" + m_30x45
				+ "]";
	}
	
	
	
	

}
