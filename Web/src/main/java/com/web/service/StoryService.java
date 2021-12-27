package com.web.service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.domain.Story;
import com.web.domain.Blogger;
import com.web.domain.Reservation;
import com.web.repository.BloggerRepository;
import com.web.repository.StoryRepository;



@Service
public class StoryService {
	
	private StoryRepository storyRepo;
	private BloggerRepository bloggerRepo;
	private Story story;
	private Blogger blogger;
	SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Timestamp timestamp = new Timestamp(System.currentTimeMillis());
	Date date = new Date();


	@Autowired
	public void setStoryRepo(StoryRepository storyRepo) {
		this.storyRepo = storyRepo;
	}
	
	@Autowired
	public void setBloggerRepo(BloggerRepository bloggerRepo) {
		this.bloggerRepo = bloggerRepo;
	}
	
	@Autowired
	public void setStory(Story story) {
		this.story = story;
	}
	@Autowired
	public void setBlogger(Blogger blogger) {
		this.blogger = blogger;
	}

	public List<Story> getStories() {
		return storyRepo.findAll();
	}
	
	

	public Story getStory(){
		return story;
		
	}
	public Blogger getBlogger(){
		return blogger;
		
	}
	public List<Blogger> getBloggerList(){
		
		return bloggerRepo.findAll();
		 
	}
	
	
	
	public List<Story> getStorylist(){
		return storyRepo.findAll();
		
		
	}

	public Story getSpecificStory(String title) {
		return storyRepo.findByTitle(title);
	}	
	
	
	
	
		
//		public Story getStory() {
//		return story;
//	}

		//*save
		public void storySave(Story story) {
			
			story.setPosted(timestamp);

			System.out.println(story.getId());
			System.out.println(story.getTitle());
			System.out.println(story.getContent());
			System.out.println(story.getImgurl());
			System.out.println(story.getPosted());
			System.out.println(story.getBlogger());
			
			storyRepo.save(story);
	
	}
	
//	@PostConstruct
//	public void init(){
//		Blogger blogger = new Blogger("BelsőGyula", 25);
//		bloggerRepo.save(blogger);
//		
//		Story story = new Story("Belső cím","Belső tartalom", new Date(), blogger); 
//		storyRepo.save(story);
//	}
//	

}