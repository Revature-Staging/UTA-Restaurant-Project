package com.revature.restaurantmanagementservice.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "restaurants")
@Component
@Scope("prototype")
public class Restaurant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer restaurantId;

	private String restaurantName;
	private String streetAddress;
	private Integer zipCode;
	@Column(name = "feedback_score")
	private Double rating;

	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(
		name = "restaurant_menu_items",
		joinColumns = { @JoinColumn(name = "restaurant_id") },
		inverseJoinColumns = {
			@JoinColumn(name = "menu_item_id") }
	)
	private Set<MenuItem> menuItems = new HashSet<MenuItem>();

	public Restaurant() {
		super();
	}

	public Restaurant(String restaurantName, String streetAddress, Integer zipCode) {
		super();
		this.restaurantName = restaurantName;
		this.streetAddress = streetAddress;
		this.zipCode = zipCode;
	}

	public Integer getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}
	
	public Set<MenuItem> getMenuItems() {
		return menuItems;
	}

	public void setMenuItems(Set<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}

	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", restaurantName=" + restaurantName + ", streetAddress="
				+ streetAddress + ", zipCode=" + zipCode + ", rating=" + rating + "]";
	}

	

}
