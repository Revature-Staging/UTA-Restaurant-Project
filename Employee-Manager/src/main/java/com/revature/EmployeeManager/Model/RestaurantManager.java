package com.revature.EmployeeManager.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "restaurant_managers")
public class RestaurantManager {

	
	/*
	 * @OneToOne
	 * 
	 * @JoinColumn(name = "employee_id")
	 */
	@Column(name = "employee_id")
	private Integer employeeId;
	@Id
	private Integer restaurant_id;
	/* @Column(name = "restaurant_id") */
	//private ArrayList<Integer> restaurant_id = new ArrayList<Integer>();
	
	@Override
	public String toString() {
		return "RestaurantManager [employeeId=" + employeeId + ", restaurant_id=" + restaurant_id + "]";
	}

	public RestaurantManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RestaurantManager(Integer employeeId, Integer restaurant_id) {
		super();
		this.employeeId = employeeId;
		this.restaurant_id = restaurant_id;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employee_id) {
		this.employeeId = employee_id;
	}

	public Integer getRestaurant_id() {
		return restaurant_id;
	}

	public void setRestaurant_id(Integer restaurant_id) {
		this.restaurant_id = restaurant_id;
	}
	
}
