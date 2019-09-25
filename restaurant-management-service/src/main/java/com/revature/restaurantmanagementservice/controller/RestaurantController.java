package com.revature.restaurantmanagementservice.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.restaurantmanagementservice.model.MenuItem;
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
	
	@RequestMapping("menuItems/{id}")
	public Set<MenuItem> findRestaurantMenuItems(@PathVariable int id) {
		return restaurantService.getMenuItems(id);
	}
	
	@PostMapping("/addItem/{restaurantId}")
	public void addMenuItem(@PathVariable int restaurantId, @RequestBody MenuItem menuItem) {

		restaurantService.addMenuItem(restaurantId, menuItem);

	}
	
	@DeleteMapping("/item")
	public void deleteMenuItemFromRestaurant(@RequestParam int restaurantId, @RequestParam int menuItemId) {
		
		restaurantService.deleteMenuItem(restaurantId, menuItemId);
	}
	
}
