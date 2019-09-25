package com.revature.restaurantmanagementservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.restaurantmanagementservice.model.MenuItem;
import com.revature.restaurantmanagementservice.service.MenuService;
import com.revature.restaurantmanagementservice.service.RestaurantService;

@RestController
@RequestMapping("/menu")
public class MenuController {

	@Autowired
	MenuService menuService;
	@Autowired
	RestaurantService restaurantService;

	
	@PutMapping("/item")
	public void updateMenuItem(@RequestBody MenuItem menuItem) {
		
		menuService.updateMenuItem(menuItem);
		
	}

}
