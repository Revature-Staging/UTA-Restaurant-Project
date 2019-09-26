package com.revature.EmployeeManager.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.EmployeeManager.Model.Employee;
import com.revature.EmployeeManager.Model.JobRole;
import com.revature.EmployeeManager.Model.RestaurantEmployee;
import com.revature.EmployeeManager.Repository.EmployeeRepository;
import com.revature.EmployeeManager.Repository.JobRolesRepository;
import com.revature.EmployeeManager.Repository.RestaurantEmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	JobRolesRepository jobRolesRepository;
	@Autowired
	RestaurantEmployeeRepository restaurantEmployeeRepository;

	public Iterable<Employee> findAll() { // Returns an iterable of all
											// Employees
		return employeeRepository.findAll();
	}

	public Employee findByID(int empID) { // Returns an employee based on
											// employee id
		Optional<Employee> employeeOptional = employeeRepository.findById(empID);
		if (employeeOptional.isPresent())
			return employeeOptional.get();
		else
			throw new NullPointerException();
	}

	public void addEmployee(Employee emp) { // Adds a new employee to the
											// database
		Optional<Employee> employeeOptional = employeeRepository.findById(emp.getEmployeeID());
		JobRole jobRole = emp.getJob_role_id();
		System.out.println(jobRole);
		Optional<JobRole> jobRoleOptional = jobRolesRepository.findById(jobRole.getRole_id());
		if (jobRoleOptional.isPresent()) {
			jobRole = jobRoleOptional.get();
			System.out.println(jobRole);
			emp.setJob_role_id(jobRole);
		}
		if (!employeeOptional.isPresent())
			employeeRepository.save(emp);
	}

	public void removeEmployee(int id) { // Removes an Employee from the
											// database
		employeeRepository.deleteById(id);
	}

	public void updateEmployee(Employee emp) {
		employeeRepository.save(emp);
	}
	
	public void updateEmployee(Employee emp, RestaurantEmployee restEmp) {
		employeeRepository.save(emp);
		restaurantEmployeeRepository.save(restEmp);
		/*Set<Integer> idSet = new Set<>();
		idSet.add(emp.getEmployeeID());
		List<RestaurantEmployee> set = restaurantEmployeeRepository.findAllById(idSet);*/ 
	}
}
