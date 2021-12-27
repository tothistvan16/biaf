package com.web.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Orders {
	@GeneratedValue
	@Id
	private Long id;
	private String orders_id;
	private String orders_name;
	private String orders_code;
	private String orders_email;
	private String csoport;
	private int csoportkepszam;
	private int m_9x13;
	private int m_10x13;
	private int m_10x15;
	private int m_13x18;
	private int m_15x20;
	private int m_28x24;
	private int m_20x30;
	private int m_30x40;
	private int m_30x45;
	private String photourlweb;
	private String photoname;
	private String note;
	private boolean bol;
	public Orders(Long id, String orders_id, String orders_name, String orders_code, String orders_email,
			String csoport, int csoportkepszam, int m_9x13, int m_10x13, int m_10x15, int m_13x18, int m_15x20,
			int m_28x24, int m_20x30, int m_30x40, int m_30x45, String photourlweb, String photoname, String note,
			boolean bol) {
		super();
		this.id = id;
		this.orders_id = orders_id;
		this.orders_name = orders_name;
		this.orders_code = orders_code;
		this.orders_email = orders_email;
		this.csoport = csoport;
		this.csoportkepszam = csoportkepszam;
		this.m_9x13 = m_9x13;
		this.m_10x13 = m_10x13;
		this.m_10x15 = m_10x15;
		this.m_13x18 = m_13x18;
		this.m_15x20 = m_15x20;
		this.m_28x24 = m_28x24;
		this.m_20x30 = m_20x30;
		this.m_30x40 = m_30x40;
		this.m_30x45 = m_30x45;
		this.photourlweb = photourlweb;
		this.photoname = photoname;
		this.note = note;
		this.bol = bol;
	}
	
	public Orders (String orders_id, String orders_name, String orders_code, String orders_email,
			String csoport, int csoportkepszam, int m_9x13, int m_10x13, int m_10x15, int m_13x18, int m_15x20,
			int m_28x24, int m_20x30, int m_30x40, int m_30x45, String photourlweb, String photoname, String note,
			boolean bol) {
		super();
		
		this.orders_id = orders_id;
		this.orders_name = orders_name;
		this.orders_code = orders_code;
		this.orders_email = orders_email;
		this.csoport = csoport;
		this.csoportkepszam = csoportkepszam;
		this.m_9x13 = m_9x13;
		this.m_10x13 = m_10x13;
		this.m_10x15 = m_10x15;
		this.m_13x18 = m_13x18;
		this.m_15x20 = m_15x20;
		this.m_28x24 = m_28x24;
		this.m_20x30 = m_20x30;
		this.m_30x40 = m_30x40;
		this.m_30x45 = m_30x45;
		this.photourlweb = photourlweb;
		this.photoname = photoname;
		this.note = note;
		this.bol = bol;
	}
	
	
	
	public Orders() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOrders_id() {
		return orders_id;
	}
	public void setOrders_id(String orders_id) {
		this.orders_id = orders_id;
	}
	public String getOrders_name() {
		return orders_name;
	}
	public void setOrders_name(String orders_name) {
		this.orders_name = orders_name;
	}
	public String getOrders_code() {
		return orders_code;
	}
	public void setOrders_code(String orders_code) {
		this.orders_code = orders_code;
	}
	public String getOrders_email() {
		return orders_email;
	}
	public void setOrders_email(String orders_email) {
		this.orders_email = orders_email;
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
	public String getPhotourlweb() {
		return photourlweb;
	}
	public void setPhotourlweb(String photourlweb) {
		this.photourlweb = photourlweb;
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
	@Override
	public String toString() {
		return "Orders [id=" + id + ", orders_id=" + orders_id + ", orders_name=" + orders_name + ", orders_code="
				+ orders_code + ", orders_email=" + orders_email + ", csoport=" + csoport + ", csoportkepszam="
				+ csoportkepszam + ", m_9x13=" + m_9x13 + ", m_10x13=" + m_10x13 + ", m_10x15=" + m_10x15 + ", m_13x18="
				+ m_13x18 + ", m_15x20=" + m_15x20 + ", m_28x24=" + m_28x24 + ", m_20x30=" + m_20x30 + ", m_30x40="
				+ m_30x40 + ", m_30x45=" + m_30x45 + ", photourlweb=" + photourlweb + ", photoname=" + photoname
				+ ", note=" + note + ", bol=" + bol + "]";
	}
	
	
	
	
}
