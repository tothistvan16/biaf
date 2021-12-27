package com.web.domain;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Blogger {
	
	@GeneratedValue
	@Id
	private Long id;
	private String name;
	private int age;
	@OneToMany(mappedBy = "blogger")
	private List<Story> stories;
	public Blogger(Long id, String name, int age, List<Story> stories) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.stories = stories;
	}
	public Blogger() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Story> getStories() {
		return stories;
	}
	public void setStories(List<Story> stories) {
		this.stories = stories;
	}
	@Override
	public String toString() {
		return "Blogger [id=" + id + ", name=" + name + ", age=" + age + ", stories=" + stories + "]";
	}
	
	
}
