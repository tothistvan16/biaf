package com.web.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.domain.Authentication;
import com.web.domain.Orders;
import com.web.domain.Photos;
import com.web.repository.AuthenticationRepository;
import com.web.repository.OrdersRepository;

@Service
public class OrderService {

	// ************//
	// REPOSITORY//
	// ************//
	private OrdersRepository ordersrepo;
	private AuthenticationRepository authrepo;
	// ************//
	// OBJECT//
	// ************//
	private Orders orders;
	private Authentication authentication;

	// ****************//
	// OBJECT INJECTION//
	// ****************//
	@Autowired
	public void setOrdersrepo(OrdersRepository ordersrepo) {
		this.ordersrepo = ordersrepo;
	}

	@Autowired
	public void setOrders(Orders orders) {
		this.orders = orders;
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
	public Orders getOrders() {
		return orders;
	}
	
	public OrdersRepository getOrdersrepo() {
		return ordersrepo;
	}

	public AuthenticationRepository getAuthrepo() {
		return authrepo;
	}

	public Authentication getAuthentication() {
		return authentication;
	}

	

	// ************//
	// GET ALL LIST//
	// ************//
	
	
	public List<Orders> getOrdersList() {

		List<Orders> order = ordersrepo.findAll();
		return order;
	}
	
	
	public void processorder(List<Photos> photos2, Long id, String code) {
		
		authentication = authrepo.findByPassword(code);
		
		
		List<Photos> activeList = new ArrayList<>();
		for (Photos ls_photos : photos2) {
			if (ls_photos.isBol() == true) {
				activeList.add(ls_photos);
			}
		}

		
		for (Photos ls_photo : activeList) {
			
			Orders orders = new Orders();
			
			orders.setOrders_id(String.valueOf(id));
			orders.setOrders_name(authentication.getName());
			orders.setOrders_code(code);
			orders.setOrders_email(authentication.getEmail());
			orders.setCsoport(ls_photo.getCsoport());
			orders.setCsoportkepszam(ls_photo.getCsoportkepszam());
			orders.setM_9x13(ls_photo.getM_9x13());
			orders.setM_10x15(ls_photo.getM_10x15());
			orders.setM_13x18(ls_photo.getM_13x18());
			orders.setM_15x20(ls_photo.getM_15x20());
			orders.setM_28x24(ls_photo.getM_28x24());
			orders.setM_20x30(ls_photo.getM_20x30());
			orders.setPhotourlweb(ls_photo.getPhotourlweb());
			orders.setPhotoname(ls_photo.getPhotoname());
			orders.setNote(ls_photo.getNote());
			orders.setBol(ls_photo.isBol());
			
			ordersrepo.save(orders);
		}
		
		
		System.out.println(activeList);

	}

	
	

	// *********************//
	// SAVE//
	// *********************//

}
