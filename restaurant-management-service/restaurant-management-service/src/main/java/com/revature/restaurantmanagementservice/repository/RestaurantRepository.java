package com.revature.restaurantmanagementservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.revature.restaurantmanagementservice.model.Restaurant;

public interface RestaurantRepository extends CrudRepository<Restaurant, Integer> {

}
