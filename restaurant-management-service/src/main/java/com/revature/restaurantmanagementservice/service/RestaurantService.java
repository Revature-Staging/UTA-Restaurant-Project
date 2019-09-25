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
	MenuService menuService;

	public Iterable<Restaurant> findAll() { // Returns an Iterable of all restaurants.

		return restaurantRepository.findAll();
	}

	public Restaurant findById(int id) { // Returns a Restaurant by the given Id.
		Optional<Restaurant> restaurantOptional = restaurantRepository.findById(id);
		if (restaurantOptional.isPresent())
			return restaurantOptional.get();
		else
			throw new NullPointerException(); //Create Custom Exception
	}

	public Set<MenuItem> getMenuItems(int restaurantId) { // Returns Menu Items of Restaurant
														  // by given Id.
		Restaurant restaurant = findById(restaurantId);
		return restaurant.getMenuItems();
	}
	
	public void addMenuItem(int restaurantId, MenuItem menuItem) { // Adds menu item to Restaurant.
		Restaurant restaurant = findById(restaurantId);
		Set<MenuItem> hs = restaurant.getMenuItems();
		hs.add(menuItem);
		restaurant.setMenuItems(hs);
		restaurantRepository.save(restaurant);
	}
	
	public void deleteMenuItem(int restaurantId, int menuItemId) {
		
		Restaurant restaurant = findById(restaurantId);
		Set<MenuItem> menuItems = restaurant.getMenuItems();
		
		if(menuItems.size()>5) {	
			MenuItem menuItemToRemove = menuService.getMenuItem(menuItemId);
			
			if(menuItems.contains(menuItemToRemove))
				menuItems.remove(menuItemToRemove);
			else {
				System.out.println("Menu Item does not exist in this restaurant");
				throw new NullPointerException();		//Custom Error message to say menu item doesn't exist
			}
		}
		else {
			System.out.println("Restaurant would have < 5 item if deleted.");
			throw new NullPointerException();		//Custom Error message to say menu item doesn't exist
		
		}
		
		restaurant.setMenuItems(menuItems);
		restaurantRepository.save(restaurant);
	}

}
