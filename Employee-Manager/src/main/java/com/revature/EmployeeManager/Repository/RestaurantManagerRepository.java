package com.revature.EmployeeManager.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.EmployeeManager.Model.RestaurantManager;

public interface RestaurantManagerRepository extends JpaRepository<RestaurantManager, Integer> {

	List<RestaurantManager> findByemployeeId(Integer employeeID);
}
