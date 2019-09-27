package com.revature.user.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "restaurant_users")
public class RestaurantUsers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer customerId;
	
	private String userName;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName; 
	private String email;
	private String password;
	private Double rewards; 
	private Double totalSpent;
	
	public RestaurantUsers() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public RestaurantUsers(Integer customerId, String userName, String firstName, String lastName, String email,
			String password, Double rewards, Double totalSpent) {
		super();
		this.customerId = customerId;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.rewards = rewards;
		this.totalSpent = totalSpent;
	}

	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Double getRewards() {
		return rewards;
	}
	public void setRewards(Double rewards) {
		this.rewards = rewards;
	}
	public Double getTotalSpent() {
		return totalSpent;
	}
	public void setTotalSpent(Double totalSpent) {
		this.totalSpent = totalSpent;
	}
	@Override
	public String toString() {
		return "RestaurantUsers [customerId=" + customerId + ", userName=" + userName + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + ", password=" + password + ", rewards=" + rewards
				+ ", totalSpent=" + totalSpent + "]";
	}
	
}
