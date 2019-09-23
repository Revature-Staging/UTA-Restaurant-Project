package com.revature.restaurantmanagementservice.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "menu_items")
public class MenuItem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer MenuItemId;

	private String itemName;
	private Double price;
	private String description;
	private String image;
	private Integer supply;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "menuItems")
    private Set<Restaurant> restaurants = new HashSet<Restaurant>();

	
	public MenuItem() {
		super();
	}

	public MenuItem(String itemName, Double price, Integer supply) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.supply = supply;
	}

	public Integer getMenuItemId() {
		return MenuItemId;
	}

	public void setMenuItemId(Integer menuItemId) {
		MenuItemId = menuItemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getSupply() {
		return supply;
	}

	public void setSupply(Integer supply) {
		this.supply = supply;
	}
	
	public Set<Restaurant> getRestaurants() {
		return restaurants;
	}

	public void setRestaurants(Set<Restaurant> restaurants) {
		this.restaurants = restaurants;
	}

	@Override
	public String toString() {
		return "MenuItem [MenuItemId=" + MenuItemId + ", itemName=" + itemName + ", price=" + price + ", description="
				+ description + ", image=" + image + ", supply=" + supply + "]";
	}

	

}
