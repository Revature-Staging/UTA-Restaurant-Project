package com.revature.EmployeeManager.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.EmployeeManager.Model.RestaurantEmployee;

public interface RestaurantEmployeeRepository extends JpaRepository<RestaurantEmployee, Integer> {

}
