package com.web.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import ch.qos.logback.classic.pattern.DateConverter;


@Entity
@Component
public class Reservation {
	
		@GeneratedValue
		@Id
		private Long id;
		private String vezetekneve;
		private String keresztneve;
		private String fototipus;
		private String email;
		private String telefonszam;
		private String cim;
		@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
		private Date starttime;
		@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
		private Date stoptime;
		private byte numberpeople;
		private boolean active;
		public Reservation(Long id, String vezetekneve, String keresztneve, String fototipus, String email,
				String telefonszam, String cim, Date starttime, Date stoptime, byte numberpeople, boolean active) {
			super();
			this.id = id;
			this.vezetekneve = vezetekneve;
			this.keresztneve = keresztneve;
			this.fototipus = fototipus;
			this.email = email;
			this.telefonszam = telefonszam;
			this.cim = cim;
			this.starttime = starttime;
			this.stoptime = stoptime;
			this.numberpeople = numberpeople;
			this.active = active;
		}
		public Reservation() {
			super();
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getVezetekneve() {
			return vezetekneve;
		}
		public void setVezetekneve(String vezetekneve) {
			this.vezetekneve = vezetekneve;
		}
		public String getKeresztneve() {
			return keresztneve;
		}
		public void setKeresztneve(String keresztneve) {
			this.keresztneve = keresztneve;
		}
		public String getFototipus() {
			return fototipus;
		}
		public void setFototipus(String fototipus) {
			this.fototipus = fototipus;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getTelefonszam() {
			return telefonszam;
		}
		public void setTelefonszam(String telefonszam) {
			this.telefonszam = telefonszam;
		}
		public String getCim() {
			return cim;
		}
		public void setCim(String cim) {
			this.cim = cim;
		}
		public Date getStarttime() {
			return starttime;
		}
		public void setStarttime(Date starttime) {
			this.starttime = starttime;
		}
		public Date getStoptime() {
			return stoptime;
		}
		public void setStoptime(Date stoptime) {
			this.stoptime = stoptime;
		}
		public byte getNumberpeople() {
			return numberpeople;
		}
		public void setNumberpeople(byte numberpeople) {
			this.numberpeople = numberpeople;
		}
		public boolean isActive() {
			return active;
		}
		public void setActive(boolean active) {
			this.active = active;
		}
		@Override
		public String toString() {
			return "Reservation [id=" + id + ", vezetekneve=" + vezetekneve + ", keresztneve=" + keresztneve
					+ ", fototipus=" + fototipus + ", email=" + email + ", telefonszam=" + telefonszam + ", cim=" + cim
					+ ", starttime=" + starttime + ", stoptime=" + stoptime + ", numberpeople=" + numberpeople
					+ ", active=" + active + "]";
		}
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	


