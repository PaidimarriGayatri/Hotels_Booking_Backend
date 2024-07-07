package com.jsp.HotelRooms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.HotelRooms.dto.HotelDto;
import com.jsp.HotelRooms.service.HotelService;
import com.jsp.HotelRooms.util.ResponseStructure;

@RestController
@CrossOrigin(origins = "*",methods = {RequestMethod.POST})
public class HotelController {
	
	@Autowired
	private HotelService  service;
	
	@PostMapping("/savehot")
	public ResponseEntity<ResponseStructure<HotelDto>> savehotel(@RequestBody HotelDto hotel){
		return service.saveHotel(hotel); 
	}

}
