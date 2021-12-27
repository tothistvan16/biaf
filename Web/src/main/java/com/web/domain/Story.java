package com.web.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Story {

	@GeneratedValue
	@Id
	private Long id;
	private String title;
	
	@Column(columnDefinition = "TEXT")
	private String content;

	private Date posted;
	
	@ManyToOne
	private Blogger blogger;
	private String imgurl;

	private Story() {}
	
	
	public Story(String title, String content, Date posted, Blogger blogger, String imgurl ) {
		this.title = title;
		this.content = content;
		this.posted = posted;
		this.blogger = blogger;
		this.imgurl = imgurl;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getPosted() {
		return posted;
	}

	public void setPosted(Date posted) {
		this.posted = posted;
	}

	public Blogger getBlogger() {
		return blogger;
	}

	public void setBlogger(Blogger blogger) {
		this.blogger = blogger;
	}
	
	
	
	public String getImgurl() {
		return imgurl;
	}


	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Story [title=" + title + "]";
	}

}
