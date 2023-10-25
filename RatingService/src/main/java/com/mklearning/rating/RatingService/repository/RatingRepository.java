package com.mklearning.rating.RatingService.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mklearning.rating.RatingService.entities.Rating;

public interface RatingRepository extends MongoRepository<Rating, String>{

	//custom finder methods
	List<Rating> findByUserId(String userId);
	
	List<Rating> findByHotelId(String hotelId);
}
