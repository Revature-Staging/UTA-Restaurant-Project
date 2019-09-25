package com.revature.EmployeeManager.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "job_roles")
public class JobRole {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonIgnore
	private Integer role_id;
	private String job_role;

	public JobRole() {
		super();
	}

	public JobRole(Integer role_id, String job_role) {
		super();
		this.role_id = role_id;
		this.job_role = job_role;
	}

	public Integer getRole_id() {
		return role_id;
	}

	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}

	public String getJob_role() {
		return job_role;
	}

	public void setJob_role(String job_role) {
		this.job_role = job_role;
	}

	@Override
	public String toString() {
		return "JobRoleModel [role_id=" + role_id + ", job_role=" + job_role + "]";
	}

}
