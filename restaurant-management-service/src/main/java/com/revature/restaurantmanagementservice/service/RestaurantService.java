package com.revature.restaurantmanagementservice.service;

import java.util.Optional;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

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

	public Iterable<Restaurant> findAll() {

		return restaurantRepository.findAll();
	}

	public Restaurant findById(int id) {
		Optional<Restaurant> restaurant = restaurantRepository.findById(id);

		if (restaurant.isPresent())
			return restaurant.get();
		else
			throw new NullPointerException();
	}

	public void addMenuItem(int restaurantId) {

		Restaurant restaurant = findById(restaurantId);

		Set<MenuItem> hs = restaurant.getMenuItems();
		//hs.add(new MenuItem("Burrito", 3.99, 5));
		restaurant.setMenuItems(hs);
		restaurantRepository.save(restaurant);
	}

	public void deleteRestaurant(int id) {
		restaurantRepository.deleteById(id);
		
	}

}
