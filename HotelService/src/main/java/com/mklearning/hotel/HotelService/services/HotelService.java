package com.mklearning.hotel.HotelService.services;

import java.util.List;

import com.mklearning.hotel.HotelService.entities.Hotel;

public interface HotelService {
	
	//create
	Hotel create(Hotel hotel);
	
	//getall
	List<Hotel> getAll();
	
	
	//get single 
	Hotel get(String id);

}
