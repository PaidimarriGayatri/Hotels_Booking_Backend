package com.jsp.HotelRooms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.HotelRooms.dao.HotelDao;
import com.jsp.HotelRooms.dto.HotelDto;
import com.jsp.HotelRooms.util.ResponseStructure;

@Service
public class HotelService {
	
	@Autowired
	private HotelDao dao;
	
	public  ResponseEntity<ResponseStructure<HotelDto>> saveHotel (HotelDto hotel){
		ResponseStructure<HotelDto> rs=new ResponseStructure<HotelDto>();
		HotelDto hr=dao.savehotel(hotel);
		rs.setData(hr);
		rs.setMsg("user details saved successfully");
		rs.setStatus(HttpStatus.CREATED.value());
		
		return new ResponseEntity<ResponseStructure<HotelDto>>(rs,HttpStatus.CREATED);
		
	}
	  

}
