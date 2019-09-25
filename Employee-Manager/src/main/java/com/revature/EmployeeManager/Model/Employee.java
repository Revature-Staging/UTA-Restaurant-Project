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
	private Integer employee_id;
	private String firstname;
	private String lastname;
	private String username;
	private String password;
	private String email;
	private Integer job_role_id;
//	@ManyToOne//(cascade = { CascadeType.ALL })
//	@JoinColumn(name = "job_role_id")
//	private JobRole role_id;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer employeeID, String firstname, String lastname, String username, String password,
			String email, Integer job_role_id) {
		super();
		this.employee_id = employeeID;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.email = email;
		this.job_role_id = job_role_id;
	}

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

	public Integer getJob_role_id() {
		return job_role_id;
	}

	public void setJob_role_id(Integer job_role_id) {
		this.job_role_id = job_role_id;
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + employee_id + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", username=" + username + ", password=" + password + ", email=" + email + ", job_role_id=" + job_role_id
				+ "]";
	}

}
