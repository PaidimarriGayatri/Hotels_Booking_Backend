package com.jsp.HotelRooms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.HotelRooms.dao.HotelDao;
import com.jsp.HotelRooms.dto.HotelDto;

public interface HotelRepo extends JpaRepository<HotelDto, Integer> {

}
