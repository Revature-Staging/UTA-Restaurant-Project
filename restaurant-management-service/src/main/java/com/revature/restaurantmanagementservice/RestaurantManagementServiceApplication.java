package com.revature.restaurantmanagementservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableDiscoveryClient	Remove comment when Eureka Server is up.
@SpringBootApplication
public class RestaurantManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantManagementServiceApplication.class, args);
	}

}
