package com.revature.EmployeeManager.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Integer employee_id;
	protected String firstname;
	protected String lastname;
	protected String username;
	protected String password;
	protected String email;
	@ManyToOne
	@JoinColumn(name = "job_role_id")
	protected JobRole role_id;

	public Integer getEmployeeID() {
		return employee_id;
	}

	public void setEmployeeID(Integer employeeID) {
		this.employee_id = employeeID;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public JobRole getJob_role_id() {
		return role_id;
	}

	public void setJob_role_id(JobRole job_role_id) {
		this.role_id = job_role_id;
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + employee_id + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", username=" + username + ", password=" + password + ", email=" + email + ", job_role_id=" + role_id
				+ "]";
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer employeeID, String firstname, String lastname, String username, String password,
			String email, JobRole job_role_id) {
		super();
		this.employee_id = employeeID;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.email = email;
		this.role_id = job_role_id;
	}

}
