package com.mklearning.hotel.HotelService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mklearning.hotel.HotelService.entities.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String>{

}
