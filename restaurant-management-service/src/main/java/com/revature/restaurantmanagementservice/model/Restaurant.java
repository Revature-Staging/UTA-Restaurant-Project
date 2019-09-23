package com.revature.restaurantmanagementservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "restaurants")
public class Restaurant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer restaurantId;

	private String restaurantName;
	private String streetAddress;
	private Integer zipCode;
	@Column(name="feedback_score")
	private Double rating;

	//private List<MenuItems> menuItems;

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

	@Override
	public String toString() {
		return "Restaurant [id=" + restaurantId + ", restaurantName=" + restaurantName + ", streetAddress=" + streetAddress
				+ ", zipCode=" + zipCode + ", rating=" + rating + "]";
	}

}
