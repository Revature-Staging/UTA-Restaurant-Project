package com.revature.restaurantmanagementservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.restaurantmanagementservice.model.Restaurant;
import com.revature.restaurantmanagementservice.service.RestaurantService;

@RestController
public class RestaurantController {
	
	@Autowired
	RestaurantService restaurantService;
	
	@RequestMapping("/findAll")
	public Iterable<Restaurant> findAllRestaurants() {
		return restaurantService.findAll();
	}

}
