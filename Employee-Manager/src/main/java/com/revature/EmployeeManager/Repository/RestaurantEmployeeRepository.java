package com.revature.EmployeeManager.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.EmployeeManager.Model.RestaurantEmployee;

public interface RestaurantEmployeeRepository extends JpaRepository<RestaurantEmployee, Integer> {

	List<RestaurantEmployee> findByrestaurantId(Integer restaurantID);
}
