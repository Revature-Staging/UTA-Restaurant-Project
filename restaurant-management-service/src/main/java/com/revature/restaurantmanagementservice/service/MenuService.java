package com.revature.restaurantmanagementservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.restaurantmanagementservice.model.MenuItem;
import com.revature.restaurantmanagementservice.repository.MenuRepository;

@Service
public class MenuService {

	@Autowired
	MenuRepository menuRepository;

	public MenuItem getMenuItem(int menuItemId) {
		 Optional<MenuItem> itemOptional = menuRepository.findById(menuItemId);
		 if(itemOptional.isPresent())
			 return itemOptional.get();
		 else {
			 System.out.println("Menu Item does not exist.");
			 throw new NullPointerException();	//Add Custom Exception to say menu Item did not exist.
		 }
		 }
	
	public void updateMenuItem(MenuItem updatedMenuItem) { // Updates Menu Item in DB.
		menuRepository.save(updatedMenuItem);

	}
	
}
