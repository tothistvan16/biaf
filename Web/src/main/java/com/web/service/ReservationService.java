package com.web.service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.domain.Datestring;
import com.web.domain.Day;
import com.web.domain.Hour;
import com.web.domain.Minute;
import com.web.domain.Month;
import com.web.domain.Reservation;
import com.web.domain.TimeString;
import com.web.domain.Year;
import com.web.repository.DayRepository;
import com.web.repository.HourRepository;
import com.web.repository.MinuteRepository;
import com.web.repository.MonthRepository;
import com.web.repository.ReservationRepository;
import com.web.repository.YearRepository;
@Service // üzleti logikát tartalmazza
public class ReservationService {

	SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Timestamp timestamp = new Timestamp(System.currentTimeMillis());
	Date date = new Date();

//************//	
//REPOSITORY//
//************//	

	private ReservationRepository reservationRepo;
	private YearRepository yearRepo;
	private MonthRepository monthRepo;
	private DayRepository   dayRepo;
	private HourRepository  hourRepo;
	private MinuteRepository minuteRepo;
	
	
	
//************//	
//OBJECT//
//************//	

	private Reservation reservation;
	private Year year;
	private Month month;
	private Day day;
	private Hour hour;
	private Minute minute;
	private Datestring datestring;
	private TimeString timestring;
	
//****************//	
//OBJECT INJECTION//
//****************//	
	@Autowired
	private void setReservationRepo(ReservationRepository reservationRepo) {
		this.reservationRepo = reservationRepo;
	}

	@Autowired
	public void setYearRepo(YearRepository yearRepo) {
		this.yearRepo = yearRepo;
	}

	@Autowired
	public void setMonthRepo(MonthRepository monthRepo) {
		this.monthRepo = monthRepo;
	}
	@Autowired
	public void setDayRepo(DayRepository dayRepo) {
		this.dayRepo = dayRepo;
	}
	@Autowired
	public void setHourRepo(HourRepository hourRepo) {
		this.hourRepo = hourRepo;
	}

	@Autowired
	public void setMinuteRepo(MinuteRepository minuteRepo) {
		this.minuteRepo = minuteRepo;
	}

	@Autowired
	private void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	@Autowired
	public void setYear(Year year) {
		this.year = year;
	}
	@Autowired
	public void setMonth(Month month) {
		this.month = month;
	}
	@Autowired
	public void setDay(Day day) {
		this.day = day;
	}
	@Autowired
	public void setHour(Hour hour) {
		this.hour = hour;
	}
	@Autowired
	public void setMinute(Minute minute) {
		this.minute = minute;
	}
	@Autowired
	public void setDatestringstart(Datestring datestring) {
		this.datestring = datestring;
	}
	@Autowired
	public void setTimestring(TimeString timestring) {
		this.timestring = timestring;
	}

	
	// **************//
	// OBJECT GETTER //
	// **************//

	

	
	

	public Reservation reservationGet() {
		return reservation;
	}
	
	public Year yearGet() {
		return year;
	}
	public Month monthGet() {
		return month;
	}
	public Day dayGet() {
		return day;
	}
	public Hour hourGet() {
		return hour;
	}
	public Minute minuteGet() {
		return minute;
	}
	
	public Datestring getDatestring() {
		return datestring;
	}
	public TimeString getTimestring() {
		return timestring;
	}
	
	

	// ********//
	// SAVE //
	// ********//

	

	

	

	public void reservationSave(Reservation reservation , TimeString timestring) {
		String start = timestring.getStarttimestr();
		String stop = timestring.getStoptimestr(); 
		start = start.replace("T", " ") + ":00";
		stop = stop.replace("T", " ") + ":00";
	
		reservation.setStarttime(Timestamp.valueOf(start));  
		reservation.setStoptime(Timestamp.valueOf(stop));
		
		reservationRepo.save(reservation);

	}

	// ************//
	// GET ALL LIST//
	// ************//

	public List<Reservation> getReservationList() {

		List<Reservation> reservation = reservationRepo.findAll();
		return reservation;
	}
	
	public List<Year> getYearList() {

		List<Year> year = yearRepo.findAll();
		return year;
	}
	
	public List<Month> getMonthList() {

		List<Month> month = monthRepo.findAll();
		return month;
	}
	public List<Day> getDayList() {

		List<Day> day = dayRepo.findAll();
		return day;
	}
	
	public List<Hour> getHourList() {

		List<Hour> hour = hourRepo.findAll();
		return hour;
	}
	public List<Minute> getMinuteList() {

		List<Minute> minute = minuteRepo.findAll();
		return minute;
	}
	
	// *******************//
	// DELETE OBJECT BY ID//
	// *******************//
	
	public void refreshActiveReservationList() {
		List<Reservation> reservation = reservationRepo.findAll();

		for (Reservation ls_reserv : reservation) {
			if (timestamp.before(ls_reserv.getStoptime())) {
				ls_reserv.setActive(true);
				reservationRepo.save(ls_reserv);
			}
		}

	}

	public void testTimestamp() {
		System.out.println(timestamp); // 2021-03-24 16:34:26.666
		System.out.println(new Timestamp(date.getTime())); // 2021-03-24 16:34:26.666 // number of milliseconds since
															// January 1, 1970, 00:00:00 GMT
		System.out.println(timestamp.getTime()); // 1616574866666
		System.out.println(sdf3.format(timestamp)); // 2021-03-24 16:48:05

	}
	
public List<Reservation> getActiveReservationList() {
		
		refreshActiveReservationList();
		List<Reservation> reservation = reservationRepo.findAll();
		List<Reservation> activereservation = new ArrayList<>();
		for (Reservation ls_reserv : reservation) {
			if (ls_reserv.isActive() == true) {
				activereservation.add(ls_reserv);
			}
		}

		return activereservation ;
	}
	
	
	

}
