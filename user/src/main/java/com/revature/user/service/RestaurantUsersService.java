package com.revature.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.revature.user.model.RestaurantUsers;
import com.revature.user.repository.RestaurantUsersRepository;

@Service
public class RestaurantUsersService {

	@Autowired
	RestaurantUsersRepository repo;
	
	public List<RestaurantUsers> getAll() {
		List<RestaurantUsers> restaurantUsers = repo.findAll();
		return restaurantUsers;
	}
	
	public RestaurantUsers getByUserName(String userName) {
		return repo.findByUserName(userName);
	}
	
	public Optional<RestaurantUsers> getById(Integer id) {
		return repo.findById(id);
	}
	
}
