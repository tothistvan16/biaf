package com.web.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.env.RandomValuePropertySource;
import org.springframework.stereotype.Service;

import com.web.domain.Authentication;
import com.web.domain.Photos;
import com.web.domain.Year;
import com.web.repository.AuthenticationRepository;
import com.web.repository.PhotosRepository;

@Service // üzleti logikát tartalmazza
public class AdminService {

//************//	
//REPOSITORY//      
//************//		

	private PhotosRepository photorepo;
	private AuthenticationRepository authrepo;
//************//	
//OBJECT//
//************//
	private Photos photos;
	private Authentication authentication;

//****************//	
//OBJECT INJECTION//
//****************//
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
//**************//	
//OBJECT GETTER //
//**************//	

	public Photos getPhotos() {
		return photos;
	}

	public Authentication getAuthentication() {
		return authentication;
	}

//************//	
//GET ALL LIST//
//************//		

	public List<Photos> getPhotoList() {

		List<Photos> photo = photorepo.findAll();
		return photo;
	}

	public List<Authentication> getAuthenticationList() {

		List<Authentication> auth = authrepo.findAll();
		return auth;
	}
//********//	
//SAVE    //
//********//	

	public void photosSave(Photos photos) {

		photorepo.save(photos);

	}
//***************************//	
//AUTHENTICATION GENERATED   //
//***************************//	
	public void AuthenticationSave(Authentication auth) {
	//	List<Authentication> auth4 = null;
		
		int a = auth.getFromgroup();
		
		if (a != 0) {
			
		for (int i= (a); i < auth.getTogroup(); i++ ) {
			Authentication aut = new Authentication();
			aut.setCsoport(auth.getCsoport());
			aut.setCsoportcode(auth.getCsoportcode() + i );	
			aut.setFromgroup(auth.getFromgroup());
			aut.setTogroup(auth.getTogroup());
			aut.setPassword(getRandomNumberString());
			
			
			authrepo.save(aut);
		}
		
			
		}else {authrepo.save(auth);}  

	}
	
	
	
public void authenticationModify(Authentication auth) {
	
	authrepo.save(auth);
	
	
	
	
}	
	
	
	
	
	
	
	
	

//*******************//	
//DELETE OBJECT BY ID//
//*******************//	

	public void authDel(Long id) {
		authrepo.deleteById(id);

	}

	public void photosDel(Long id) {
		photorepo.deleteById(id);

	}
	//*******************//	
	//Modify OBJECT BY ID//
	//*******************//		
	public void authModify1(Long id) {
		
		
	}
	

//*******************//	
//PROCESS PHOTO      //
//*******************//		
	

	public void processPhotos(Photos photos2) {
		
        int a = photos2.getStartnumberstr();
		
		if (a != 0) {
			
		for (int i= (a); i < photos2.getStopnumberstr() + 1 ; i++ ) {
			Photos phot = new Photos();
			
			phot.setCsoport(photos2.getCsoport());
			phot.setCsoportkepszam(i);
			phot.setPhotourl(photos2.getPhotourl());
			phot.setPhotourlweb(photos2.getPhotourl() +
					photos2.getCsoport().toLowerCase() + "/csoport_" + photos2.getCsoport().toLowerCase() + "-" + i + ".jpg"  );         //https://biafoto.hu/images/a/csoport_a-1.jpg
			phot.setStartnumberstr(a);
			phot.setStopnumberstr(photos2.getStopnumberstr());
			phot.setPhotoname("/csoport_" + photos2.getCsoport().toLowerCase() + "-" + i + ".jpg");
			
			
			
			
			
			photorepo.save(phot);
		}
		
			
		}else { photorepo.save(photos2); }  

	}	
	
//**********************//	
//PROCESS AUTHENTICATION//
//**********************//	
	
	public void processAuth(Authentication auth2) {
	
	

}
	
	public static String getRandomNumberString() {
	    // It will generate 6 digit random Number.
	    // from 0 to 999999
	    Random rnd = new Random();
	    int number = rnd.nextInt(999999);

	    // this will convert any number sequence into 6 character.
	    return String.format("%06d", number);
	}

	public void authModify(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
}