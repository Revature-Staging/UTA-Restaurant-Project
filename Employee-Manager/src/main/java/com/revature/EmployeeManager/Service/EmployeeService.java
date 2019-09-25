package com.revature.EmployeeManager.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.EmployeeManager.Model.Employee;
import com.revature.EmployeeManager.Repository.EmployeeRepository;
import com.revature.EmployeeManager.Repository.JobRolesRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	JobRolesRepository jobRolesRepository;

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
		// employeeRepository.findbyemail;
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
}
