package com.revature.restaurantmanagementservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "menu_items")
public class MenuItems {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String itemName;
	private Double price;
	private String description;
	private String image;
	private Integer supply;

	public MenuItems() {
		super();
	}

	public MenuItems(String itemName, Double price) {
		super();
		this.itemName = itemName;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "MenuItems [id=" + id + ", itemName=" + itemName + ", price=" + price + ", description=" + description
				+ ", image=" + image + ", supply=" + supply + "]";
	}

}
