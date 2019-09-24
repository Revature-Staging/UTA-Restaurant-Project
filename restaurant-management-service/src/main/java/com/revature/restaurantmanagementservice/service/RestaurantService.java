package com.revature.restaurantmanagementservice.service;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.restaurantmanagementservice.model.MenuItem;
import com.revature.restaurantmanagementservice.model.Restaurant;
import com.revature.restaurantmanagementservice.repository.MenuRepository;
import com.revature.restaurantmanagementservice.repository.RestaurantRepository;

@Service
public class RestaurantService {

	@Autowired
	RestaurantRepository restaurantRepository;
	@Autowired
	MenuRepository menuRepository;
	@Autowired
	Restaurant restaurant;

	public Iterable<Restaurant> findAll() {				// Returns an Iterable of all restaurants.
		
		return restaurantRepository.findAll();
	}

	public Restaurant findById(int id) {				// Returns a Restaurant by the given Id.
		
		Optional<Restaurant> restaurantOptional = restaurantRepository.findById(id);
		if (restaurantOptional.isPresent())
			return restaurantOptional.get();
		else
			throw new NullPointerException();
	}



	public void deleteRestaurant(int id) {				// Removes Restaurant by given Id.
		
		restaurantRepository.deleteById(id);
	}

	
	public void addMenuItem(int restaurantId) {			// Adds menu item to Restaurant.
		
		restaurant = findById(restaurantId);
		Set<MenuItem> hs = restaurant.getMenuItems();
		hs.add(new MenuItem("Tacos", 3.99, 15));		// Place Holder Code
		restaurant.setMenuItems(hs);
		restaurantRepository.save(restaurant);
	}
	
	
	public Set<MenuItem> getMenuItems(int restaurantId) {		// Returns Menu Items of Restaurant
																// by given Id.
		restaurant = findById(restaurantId);
		return restaurant.getMenuItems();
	}
	
	//May not need to use, we could just getRestaurant as JSON and access rating field. 
	public Double getFeedbackScore(int restaurantId) {			//Returns rating of Restaurant.
		
		restaurant = findById(restaurantId);
		return restaurant.getRating();
	}
}
