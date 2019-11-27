package com.travel.online.model;

import java.sql.Timestamp;

/*@Entity
@Table(name = "TravelSummary")*/
public class TravelSummaryResponse {
	
	/*@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)*/
	private Long id;
	//@Column(name="USER_ID")
	private String userId;
	//@Column(name="FROM_PLACE")
	private String fromPlace;
	//@Column(name="TO_PLACE")
	private String toPlace;
	//@Column(name="TRAVEL_FROM_DATE")	
	private Timestamp travelFromDate;
	//@Column(name="TRAVEL_TO_DATE")	
	private Timestamp travelToDate;
	//@Column(name="CITY")
	private String city;
	//@Column(name="PAYMENT_MODE")
	private String paymentMode;
	//@Column(name="AMOUNT")
	private double amount;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFromPlace() {
		return fromPlace;
	}
	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}
	public String getToPlace() {
		return toPlace;
	}
	public void setToPlace(String toPlace) {
		this.toPlace = toPlace;
	}
	public Timestamp getTravelFromDate() {
		return travelFromDate;
	}
	public void setTravelFromDate(Timestamp travelFromDate) {
		this.travelFromDate = travelFromDate;
	}
	public Timestamp getTravelToDate() {
		return travelToDate;
	}
	public void setTravelToDate(Timestamp travelToDate) {
		this.travelToDate = travelToDate;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
		
}
