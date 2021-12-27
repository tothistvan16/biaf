package com.web.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.domain.Authentication;
import com.web.domain.Datestring;
import com.web.domain.Orders;
import com.web.domain.Photos;
import com.web.domain.Reservation;
import com.web.service.AdminService;
import com.web.service.LoginService;
import com.web.service.OrderService;
import com.web.service.ReservationService;
import com.web.service.SubscribeEmailService;

@Controller
public class AdminController {

	private AdminService adminservice;
	private OrderService orderservice;
	private ReservationService reservationService;
	private LoginService loginService;
	private SubscribeEmailService subemailservive;
	Boolean authenticated_admin = false;

	@Autowired
	public void setSubemailservive(SubscribeEmailService subemailservive) {
		this.subemailservive = subemailservive;
	}

	@Autowired
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	@Autowired
	public void setAdminservice(AdminService adminservice) {
		this.adminservice = adminservice;
	}

	@Autowired
	public void setOrderservice(OrderService orderservice) {
		this.orderservice = orderservice;
	}

	@Autowired
	public void setReservationService(ReservationService reservationService) {
		this.reservationService = reservationService;
	}

	@RequestMapping("/admlog")
	public String loginPage(Model model) {
		model.addAttribute("loginobj", loginService.getAuthentication());
		return "admlog";
	}

	@RequestMapping("/adminlogin")
	public String adminLogin(@ModelAttribute Authentication auth, Model model) {
		String outpage = "";

		authenticated_admin = false;
		Long id = loginService.getLogin(auth);

		if (id != null) {
			auth.setId(id);
			authenticated_admin = true;
			outpage = "adminlogin";
		} else {
			outpage = "loginerr";
		}

		return outpage;
	}

	@RequestMapping("/adminiskolaimg")
	public String imgPage(Model model) {

		model.addAttribute("photolist", adminservice.getPhotoList());
		model.addAttribute("photoobj", adminservice.getPhotos());
		if (authenticated_admin == true) {
			return "adminiskolaimg";
		} else {
			return "loginerr";
		} // hiba oldalat csinálni
	}

	@PostMapping("/admiphoto_processing")
	public String photoProcessing(@ModelAttribute Photos photos, Model model) {
		adminservice.processPhotos(photos);
		if (authenticated_admin == true) {
			return "redirect:/adminiskolaimg";
		} else {
			return "loginerr";
		}
	}

	@RequestMapping("/adminauth")
	public String authPage(Model model) {

		model.addAttribute("authlist", adminservice.getAuthenticationList());
		model.addAttribute("authobj", adminservice.getAuthentication());
		if (authenticated_admin == true) {
			return "adminauth";
		} else {
			return "loginerr";
		}
	}

	@PostMapping("/adminauth_processing")
	public String authProcessing(@ModelAttribute Authentication authentication, Model model) {
		adminservice.AuthenticationSave(authentication);

		return "redirect:/adminauth";
	}

	@PostMapping("/adminmodify")
	public String authModify(@ModelAttribute Authentication authentication, Model model) {
		adminservice.authenticationModify(authentication);

		return "redirect:/adminauth";
	}

	@GetMapping("/authdel/{id}")
	public String tabledelrow(@PathVariable(name = "id") Long id, Model model) {

		adminservice.authDel(id);
		if (authenticated_admin == true) {
			return "redirect:/adminauth";
		} else {
			return "loginerr";
		}
	}

//	@GetMapping("/authmodif/{id,name,email}")
//	public String tableModifyRow(@PathVariable(name = "id") Long id, Model model) {
//
//		adminservice.authModify(id);
//		if (authenticated_admin == true) {
//		return "redirect:/adminauth";
//		} else {
//			return "loginerr";
//		}
//	}

	@RequestMapping("/adminorders")
	public String orderPage(Model model) {

		model.addAttribute("orderist", orderservice.getOrdersList());
		model.addAttribute("orderobj", orderservice.getOrders());
		if (authenticated_admin == true) {
			return "adminorders";
		} else {
			return "loginerr";
		}
	}

	@RequestMapping("/adminreservation")
	public String admreservPage(Model model) {

		model.addAttribute("reservationlist", reservationService.getReservationList());
		model.addAttribute("activereservationlist", reservationService.getActiveReservationList());
		model.addAttribute("reservationobj", reservationService.reservationGet());
		// model.addAttribute("yearlist", reservationService.getYearList());
		// model.addAttribute("monthlist", reservationService.getMonthList());
		// model.addAttribute("daylist", reservationService.getDayList());
		// model.addAttribute("hourlist", reservationService.getHourList());
		// model.addAttribute("minlist", reservationService.getMinuteList());
		// model.addAttribute("datestring", reservationService.getDatestring());
		if (authenticated_admin == true) {
			return "adminreservation";
		} else {
			return "loginerr";
		}
	}

	@RequestMapping("/adminsubscribe")
	public String admsubscribePage(Model model) {

		model.addAttribute("subscribelist", subemailservive.getSubscribeList());
		if (authenticated_admin == true) {
			return "adminsubscribe";
		} else {
			return "loginerr";
		}
	}
	@RequestMapping("/adminmessage")
	public String admmessagePage(Model model) {

		model.addAttribute("messagelist", subemailservive.getSendMessageList());
		if (authenticated_admin == true) {
			return "adminmessage";
		} else {
			return "loginerr";
		}
	}
	
	
	

}
