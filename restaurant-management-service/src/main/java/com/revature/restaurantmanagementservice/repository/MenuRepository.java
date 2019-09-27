package com.revature.restaurantmanagementservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.restaurantmanagementservice.model.MenuItem;

public interface MenuRepository extends JpaRepository<MenuItem, Integer>{

}
