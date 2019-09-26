package com.revature.user.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.revature.user.model.RestaurantUsers;
import com.revature.user.repository.RestaurantUsersDao;

@RestController
public class RestaurantUsersController {
	
	@Autowired
	RestaurantUsersDao dao;
	
	@GetMapping("/restaurant-users")
	public List<RestaurantUsers> getAll() {
		List<RestaurantUsers> restaurantUsers = dao.findAll();
		return restaurantUsers;
	}
	
	@GetMapping("/restaurant-users/username/{name}")
	public RestaurantUsers getByProduceType(@PathVariable("name") String userName) {
		return dao.findByUserName(userName);
	}

	@GetMapping("/restaurant-users/id/{id}")
	public Optional<RestaurantUsers> getById(@PathVariable("id") Integer id) {
		return dao.findById(id);
	}
}