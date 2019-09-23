package com.revature.restaurantmanagementservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.restaurantmanagementservice.model.Restaurant;
import com.revature.restaurantmanagementservice.service.RestaurantService;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {
	
	@Autowired
	RestaurantService restaurantService;
	
	@RequestMapping("/findAll")
	public Iterable<Restaurant> findAllRestaurants() {
		return restaurantService.findAll();
	}
	
	@RequestMapping("/{id}")
	public Restaurant findRestaurantById(@PathVariable int id) {
		return restaurantService.findById(id);
	}
	
	@RequestMapping("/delete/{id}")
	public void deleteRestaurant(@PathVariable int id) {
		restaurantService.deleteRestaurant(id);
	}

}
