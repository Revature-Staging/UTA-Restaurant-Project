package com.revature.EmployeeManager.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "restaurant_employees")
public class RestaurantEmployee {

	@Id
	/*@OneToOne 
	@JoinColumn(name = "employee_id")*/
	protected Integer employee_id;
	protected Integer restaurant_id;

	public RestaurantEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RestaurantEmployee(Integer employee_id, Integer restaurant_id) {
		super();
		this.employee_id = employee_id;
		this.restaurant_id = restaurant_id;
	}

	public Integer getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}

	public Integer getRestaurant_id() {
		return restaurant_id;
	}

	public void setRestaurant_id(Integer restaurant_id) {
		this.restaurant_id = restaurant_id;
	}

	@Override
	public String toString() {
		return "RestaurantEmployee [employee_id=" + employee_id + ", restaurant_id=" + restaurant_id + "]";
	}

}
