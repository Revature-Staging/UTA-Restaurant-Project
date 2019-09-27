package com.revature.user.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.revature.user.model.RestaurantUsers;
import com.revature.user.service.RestaurantUsersService;

@RestController
public class RestaurantUsersController {
	
	@Autowired
	RestaurantUsersService svc;
	
	@GetMapping("/restaurant-users")
	public List<RestaurantUsers> getAll() {
		List<RestaurantUsers> restaurantUsers = svc.getAll();
		return restaurantUsers;
	}
	
	@GetMapping("/restaurant-users/username/{name}")
	public RestaurantUsers getByUserName(@PathVariable("name") String userName) {
		return svc.getByUserName(userName);
	}

	@GetMapping("/restaurant-users/id/{id}")
	public Optional<RestaurantUsers> getById(@PathVariable("id") Integer id) {
		return svc.getById(id);
	}
}