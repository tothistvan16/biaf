package com.web.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.web.domain.Photos;

public class PhotoServiceTeszt {

	private List<Photos> photos;
	
	public PhotoServiceTeszt() {
		this.photos = new ArrayList<>();
		
	}
	public PhotoServiceTeszt(List<Photos> photos) {
		this.photos = photos;
	}
	
	public List<Photos> getPhotos() {
		return photos;
	}
	
	public void setPhotos(List<Photos> photos) {
		this.photos = photos;
	}
	
	
	
	 public void addPhotos(Photos photo) {
	        this.photos.add(photo);
	    }
	
	 
	 

	
}
