package com.jsp.HotelRooms.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.HotelRooms.dto.HotelDto;
import com.jsp.HotelRooms.repo.HotelRepo;

@Repository
public class HotelDao {

	@Autowired
	private HotelRepo repo;
	
	public HotelDto savehotel(HotelDto hotel) {
		return repo.save(hotel);
	}

	

}
