package com.example.springbootproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/test")
public class TestController {
	
	@Autowired
	private BookSlotRepository bookSlotRepo;
	@GetMapping(path="/add")
	public @ResponseBody String newSlot() {
		
		BookSlot bslot = new BookSlot("Rajat", "rajat123@gmail.com", "11:02:AM", "11:05:PM", "XX", "ECA", "CD", "CD", "CEDWVF");
		//bookSlotRepo.save(bslot);
		
		Configuration con = new Configuration().configure().addAnnotatedClass(BookSlot.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(bslot);
		tx.commit();
		
		return "Saved";
	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<BookSlot> getAllBooking() {
		return bookSlotRepo.findAll();
	}
}
