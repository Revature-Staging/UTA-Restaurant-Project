package com.revature.EmployeeManager.Repository;

import com.revature.EmployeeManager.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
