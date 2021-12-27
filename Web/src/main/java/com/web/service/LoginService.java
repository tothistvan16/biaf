package com.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.domain.Authentication;
import com.web.domain.Photos;
import com.web.repository.AuthenticationRepository;
import com.web.repository.PhotosRepository;

@Service // üzleti logikát tartalmazza
public class LoginService {

	// ************//
	// REPOSITORY//
	// ************//

	private PhotosRepository photorepo;
	private AuthenticationRepository authrepo;
	// ************//
	// OBJECT//
	// ************//
	private Photos photos;
	private Authentication authentication;

	// ****************//
	// OBJECT INJECTION//
	// ****************//
	@Autowired
	public void setPhotorepo(PhotosRepository photorepo) {
		this.photorepo = photorepo;
	}

	@Autowired
	public void setPhotos(Photos photos) {
		this.photos = photos;
	}

	@Autowired
	public void setAuthrepo(AuthenticationRepository authrepo) {
		this.authrepo = authrepo;
	}

	@Autowired
	public void setAuthentication(Authentication authentication) {
		this.authentication = authentication;
	}
	// **************//
	// OBJECT GETTER //
	// **************//

	public Photos getPhotos() {
		return photos;
	}

	public Authentication getAuthentication() {
		return authentication;
	}

	// ************//
	// GET ALL LIST//
	// ************//

	public List<Photos> getPhotoList() {

		List<Photos> photo = photorepo.findAll();
		return photo;
	}

	public List<Authentication> getAuthenticationList() {

		List<Authentication> auth = authrepo.findAll();
		return auth;
	}

	// *********************//
	// GET ALL LIST BY GROUP//
	// *********************//
	public List<Photos> getPhotoListGroup(String csoport) {
		List<Photos> photogrout = new ArrayList<>();
		List<Photos> photogr = photorepo.findAll();

		for (Photos ls_phot : photogr) {
			if (ls_phot.getCsoport().equals(csoport)) {
				photogrout.add(ls_phot);
			}
		}
		return photogrout;
	}

	public Long getLogin(Authentication auth) {
		Long id = null;
		List<Authentication> auth2 = authrepo.findAll();

		for (Authentication ls_auth : auth2) {

			if (ls_auth.getCsoport().equals(auth.getCsoport()) && ls_auth.getPassword().equals(auth.getPassword())) {

				id = ls_auth.getId();

			}

		}

		return id;

	}

	
}
