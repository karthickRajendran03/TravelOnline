/**
 *
 */
package com.travel.online.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.travel.online.dao.TravelSummaryDao;
import com.travel.online.model.TravelSummaryResponse;

/**
 * @author 458459
 *
 */
@Controller
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class TravelSummaryController {

	@Autowired
	TravelSummaryDao travelSummaryDao;


	@GetMapping("/getUserTravelSummary/{userId}")
	public ResponseEntity<List<TravelSummaryResponse>> getUserTravelSummary(@PathVariable("userId") String userId) {

		List<TravelSummaryResponse> resp = travelSummaryDao.getUserTravelSummary(userId);
		ResponseEntity<List<TravelSummaryResponse>> response= new ResponseEntity<>(resp, HttpStatus.OK);
		return response;

	}

	@GetMapping("/getAdminTravelSummary")
	public ResponseEntity<List<TravelSummaryResponse>> getAdminTravelSummary() {

		List<TravelSummaryResponse> resp = travelSummaryDao.getAdminTravelSummary();
		ResponseEntity<List<TravelSummaryResponse>> response= new ResponseEntity<>(resp, HttpStatus.OK);
		return response;

	}

}
