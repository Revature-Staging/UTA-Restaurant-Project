package com.revature.restaurantmanagementservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.restaurantmanagementservice.model.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {

}
