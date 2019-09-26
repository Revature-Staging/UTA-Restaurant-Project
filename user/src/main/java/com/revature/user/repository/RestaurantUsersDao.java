package com.revature.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.user.model.RestaurantUsers;

@Repository
public interface RestaurantUsersDao extends JpaRepository<RestaurantUsers, Integer> {
	RestaurantUsers findByUserName(String userName);
}
