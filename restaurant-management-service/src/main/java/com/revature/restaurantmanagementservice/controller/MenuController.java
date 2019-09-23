package com.revature.restaurantmanagementservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.restaurantmanagementservice.service.RestaurantService;

@RestController
@RequestMapping("/menu")
public class MenuController {

	@Autowired
	RestaurantService restaurantService;

	@RequestMapping("/addItem/{restaurantId}")
	public void addMenuItem(@PathVariable int restaurantId) {

		restaurantService.addMenuItem(restaurantId);

	}

}
