package com.revature.restaurantmanagementservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.restaurantmanagementservice.model.Restaurant;
import com.revature.restaurantmanagementservice.repository.RestaurantRepository;

@Service
public class RestaurantService {
	
	@Autowired
	RestaurantRepository restaurantRepository;

	public Iterable<Restaurant> findAll() {
		return restaurantRepository.findAll();
	}

}
