package com.example.springbootproject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Columns;

@Entity
public class BookSlot {
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	 @Column
	private String userName;
	 @Column
	private String userEmail;
	 @Column
	private String bookingDate;
	 @Column
	private String slotStartTime;
	 @Column
	private String slotEndTime;
	 @Column
	private String state;
	 @Column
	private String city;
	 @Column
	private String photographer;
	 @Column
	private String phoneNumber;
	private BookSlot() {
		
	}
	public BookSlot(String userName, String userEmail, String bookingDate, String slotStartTime, String slotEndTime, String state, String city, String photographer, String phoneNumber) {
		this.userName = userName;
		this.userEmail = userEmail;
		this.bookingDate = bookingDate;
		this.slotStartTime = slotStartTime;
		this.slotEndTime = slotEndTime;
		this.state = state;
		this.city = city;
		this.photographer = photographer;
		this.phoneNumber = phoneNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return userName;
	}
	public void setName(String userName) {
		this.userName = userName;
	}
	public void setEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getEmail() {
		return userEmail;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getSlotStartTime() {
		return slotStartTime;
	}
	public String getSlotEndTime() {
		return slotEndTime;
	}
	public void setSlotStartTime(String slotStartTime) {
		this.slotStartTime = slotStartTime;
	}
	public void setSlotEndTime(String slotEndTime) {
		this.slotEndTime = slotEndTime;
	}
	public String getState() {
		return state;
	}
	public String getCity() {
		return city;
	}
	public String getPhotographer() {
		return photographer;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPhotographer(String photographer) {
		this.photographer = photographer;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
