package com.revature.EmployeeManager.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.EmployeeManager.Model.JobRole;

public interface JobRolesRepository extends JpaRepository<JobRole, Integer>{
	
	//JobRole findByJobRole();
}
