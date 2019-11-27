package com.travel.online.dao;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.travel.online.model.TravelSummaryResponse;

@Component
public class TravelSummaryDao {
	
/*	@Autowired
	TravelRepository repository;*/

	public List<TravelSummaryResponse> getUserTravelSummary(String userId) {
		// TODO Auto-generated method stub
		//return repository.findAllByUserId(userId);
		List<TravelSummaryResponse> listResp = new ArrayList();
		TravelSummaryResponse resp = new TravelSummaryResponse();
		resp.setAmount(123);
		resp.setCity("Chennai");
		resp.setFromPlace("Cognizant CKC kits campus, scholinganallur");
		resp.setId(1l);
		resp.setPaymentMode("CASH");
		resp.setToPlace("Tambaram Railway Station, Tambaram");
		Date date = new Date();
		resp.setTravelFromDate(new Timestamp(date.getTime()));
		resp.setTravelToDate(new Timestamp(date.getTime()));
		resp.setUserId("Karthick");
		listResp.add(resp);
		TravelSummaryResponse resp1 = new TravelSummaryResponse();
		resp1.setAmount(255);
		resp1.setCity("Chennai");
		resp1.setFromPlace("Tambaram Railway Station, Tambaram");
		resp1.setId(1l);
		resp1.setPaymentMode("CASH");
		resp1.setToPlace("Cognizant CKC kits campus, scholinganallur");
		resp1.setTravelFromDate(new Timestamp(date.getTime()));
		resp1.setTravelToDate(new Timestamp(date.getTime()));
		resp1.setUserId("Karthick");
		listResp.add(resp1);
		TravelSummaryResponse resp2 = new TravelSummaryResponse();
		resp2.setAmount(456);
		resp2.setCity("Chennai");
		resp2.setFromPlace("Cognizant MEPZ campus, Tambaram");
		resp2.setId(1l);
		resp2.setPaymentMode("PAYTM");
		resp2.setToPlace("Forum Mall,Vadapalani");
		resp2.setTravelFromDate(new Timestamp(date.getTime()));
		resp2.setTravelToDate(new Timestamp(date.getTime()));
		resp2.setUserId("Karthick");
		listResp.add(resp2);
		return listResp;
	}
	
	public List<TravelSummaryResponse> getAdminTravelSummary() {
		// TODO Auto-generated method stub
		//return repository.findAll();
		List<TravelSummaryResponse> listResp = new ArrayList();
		TravelSummaryResponse resp = new TravelSummaryResponse();
		resp.setAmount(123);
		resp.setCity("Chennai");
		resp.setFromPlace("Cognizant CKC kits campus, scholinganallur");
		resp.setId(1l);
		resp.setPaymentMode("CASH");
		resp.setToPlace("Tambaram Railway Station, Tambaram");
		Date date = new Date();
		resp.setTravelFromDate(new Timestamp(date.getTime()));
		resp.setTravelToDate(new Timestamp(date.getTime()));
		resp.setUserId("Karthick");
		listResp.add(resp);
		return listResp;
	}

}
