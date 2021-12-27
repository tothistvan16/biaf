package com.web.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.extras.java8time.dialect.Java8TimeDialect;
import org.thymeleaf.spring5.ISpringTemplateEngine;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.templateresolver.ITemplateResolver;

import com.web.domain.Authentication;
import com.web.domain.Datestring;
import com.web.domain.Photos;
import com.web.domain.Reservation;
import com.web.domain.SendMessage;
import com.web.domain.Story;
import com.web.domain.Subscribe;
import com.web.domain.TimeString;
import com.web.domain.Year;
import com.web.service.LoginService;
import com.web.service.OrderService;
import com.web.service.PhotoServiceTeszt;
import com.web.service.ReservationService;
import com.web.service.StoryService;
import com.web.service.SubscribeEmailService;

@Controller
public class HomeController {
	private ReservationService reservationService;
	private StoryService storyService;
	private LoginService loginService;
	private OrderService oredrservice;
	private SubscribeEmailService subscEmailService;
	String datestart;
	String dateend;

	private ISpringTemplateEngine templateEngine(ITemplateResolver templateResolver) {
		SpringTemplateEngine engine = new SpringTemplateEngine();
		engine.addDialect(new Java8TimeDialect());
		engine.setTemplateResolver(templateResolver);
		return engine;
	}

	@Autowired
	public void setTableService(ReservationService reservationService) {
		this.reservationService = reservationService;
	}

	@Autowired
	public void setStoryService(StoryService storyService) {
		this.storyService = storyService;
	}

	@Autowired
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	@Autowired
	public void setOredrservice(OrderService oredrservice) {
		this.oredrservice = oredrservice;
	}

	@Autowired
	public void setSubscEmailService(SubscribeEmailService subscEmailService) {
		this.subscEmailService = subscEmailService;
	}

	// *********************//
//  IDŐŐPONT FOGLALÁS    //
//*********************//		
	@RequestMapping("/reservation")
	public String reservationPage(Model model) {

		reservationService.refreshActiveReservationList();
		model.addAttribute("reservationlist", reservationService.getReservationList());
		model.addAttribute("activereservationlist", reservationService.getActiveReservationList());
		model.addAttribute("reservationobj", reservationService.reservationGet());
		// model.addAttribute("yearlist", reservationService.getYearList());
		// model.addAttribute("monthlist", reservationService.getMonthList());
		// model.addAttribute("daylist", reservationService.getDayList());
		// model.addAttribute("hourlist", reservationService.getHourList());
		// model.addAttribute("minlist", reservationService.getMinuteList());
		// model.addAttribute("datestring", reservationService.getDatestring());
		model.addAttribute("timestring", reservationService.getTimestring());
		return "reservation";
	}

//********************************//
//  IDŐŐPONT FOGLALÁS FELDOLGOZÁS //
//********************************//	
	@PostMapping("/feldolg_asztalfoglalas")
	public String reservationprocessing(@ModelAttribute Reservation reservation, TimeString timestring, Model model)
			throws ParseException {
//		datestart = datestring.getSyear() + "-" + datestring.getSmonth() + "-" + datestring.getSday() + " "
//				+ datestring.getShour() + ":" + datestring.getSminute() + ":00";
//		dateend = datestring.getEyear() + "-" + datestring.getEmonth() + "-" + datestring.getEday() + " "
//				+ datestring.getEshour() + ":" + datestring.getEminute() + ":00";
//		
//		
//		
//		reservation.setStarttime(datestart);
//		reservation.setStoptime(dateend);

		System.out.println("" + timestring.getStarttimestr());
		System.out.println("" + timestring.getStoptimestr());

		reservationService.reservationSave(reservation, timestring);

		return "/sablon";
	}

	@RequestMapping("/imggalery")
	public String imgPage(Model model) {

		return "imggalery";
	}

	@RequestMapping("/blog")
	public String story(Model model) {
		model.addAttribute("pageTitle", "Minden napra egy SFJ sztori!");
		model.addAttribute("storyobj", storyService.getStory());
		model.addAttribute("storylist", storyService.getStories());
		model.addAttribute("blogger", storyService.getBlogger());
		model.addAttribute("bloggerlist", storyService.getBloggerList());
		return "blog";
	}

	@PostMapping("/feldolg_blog")
	public String blogprocessing(@ModelAttribute Story story, Model model) {
		storyService.storySave(story);
		return "/sablon";
	}

	@RequestMapping("/portfolio")
	public String portfolio(Model model) {

		return "portfolio";
	}

//fotozas oldal
	@RequestMapping("/fotozas")
	public String fotozas(Model model) {
		model.addAttribute("subscribe", subscEmailService.getSubscribe());
//		model.addAttribute("subscribelist", subscEmailService.getSubscribeList());
		return "fotozas";
	}

	@PostMapping("/feldolg_subscribe")
	public String subscribeProcessing(@ModelAttribute Subscribe subscribe, Model model) {
		subscEmailService.SubscribeSave(subscribe);
		return "redirect:/fotozas";
	}
//login	

	@RequestMapping("/login")
	public String loginPage(Model model) {
		model.addAttribute("loginobj", loginService.getAuthentication());
		return "login";
	}

//***************************//
//Autentikáció és Megerndelés//
//***************************//	

	// ************//
	// Megerndelés //
	// ************//
	@PostMapping("/auth_feldolg")
	public String authprocessing(@ModelAttribute Authentication auth, Model model) {

		String outpage = "";
		String csoport = auth.getCsoport();
		List<Photos> photos = new ArrayList<>();
		Long id = loginService.getLogin(auth);

		if (id != null) {
			auth.setId(id);
			outpage = "imggalery_a";
		} else {
			outpage = "error_login";
		}
		model.addAttribute("auth", auth);
		model.addAttribute("photoobj", loginService.getPhotos());
		model.addAttribute("photolist", loginService.getPhotoList());

		loginService.getPhotoListGroup(csoport).iterator().forEachRemaining(photos::add);
		model.addAttribute("form", new PhotoServiceTeszt(photos));
		return outpage;

	}

//***************************//
//Megerndelés  submit        //
//***************************//		

	@PostMapping("/oredr_pr")
	public String orderprocessing(@ModelAttribute PhotoServiceTeszt form, Authentication auth, Model model,
			@RequestParam String pass, Long id) {

		System.out.println(form.getPhotos());

		oredrservice.processorder(form.getPhotos(), id, pass);

		return "sablon";

	}

	@ExceptionHandler(Exception.class)
	public String exceptionHandler(HttpServletRequest rA, Exception ex, Model model) {
		model.addAttribute("errMessage", ex.getMessage());
		return "exceptionHandler";
	}

	// fotozas oldal
	@RequestMapping("/kapcsolat")
	public String kapcsolat(Model model) {
		model.addAttribute("sendmessage", subscEmailService.getSendmessage());

		return "kapcsolat";
	}

	@PostMapping("/feldolg_kapcsolat")
	public String subscribeProcessing(@ModelAttribute SendMessage sendmessage, Model model) {
		subscEmailService.sendMessageSave(sendmessage);
		return "redirect:/kapcsolat";
	}
	
	
	@RequestMapping("/galerydori")
	public String galeridori(Model model) {
		

		return "galerydori";
	}

}
