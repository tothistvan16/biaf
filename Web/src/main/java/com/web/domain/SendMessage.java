package com.web.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
@Entity
@Component
public class SendMessage {  
	

		@GeneratedValue
		@Id
		private Long id;
		private String lastname; //vezetéknév
		private String firstname; //keresztnév
		private String email;
		private String sendmessage;
		@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
		private Date senddate;
		public SendMessage(Long id, String lastname, String firstname, String email, String sendmessage,
				Date senddate) {
			super();
			this.id = id;
			this.lastname = lastname;
			this.firstname = firstname;
			this.email = email;
			this.sendmessage = sendmessage;
			this.senddate = senddate;
		}
		public SendMessage() {
			super();
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getSendmessage() {
			return sendmessage;
		}
		public void setSendmessage(String sendmessage) {
			this.sendmessage = sendmessage;
		}
		public Date getSenddate() {
			return senddate;
		}
		public void setSenddate(Date senddate) {
			this.senddate = senddate;
		}
		@Override
		public String toString() {
			return "SendMessage [id=" + id + ", lastname=" + lastname + ", firstname=" + firstname + ", email=" + email
					+ ", sendmessage=" + sendmessage + ", senddate=" + senddate + "]";
		}
		

}
