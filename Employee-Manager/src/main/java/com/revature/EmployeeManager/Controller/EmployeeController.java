package com.revature.EmployeeManager.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.EmployeeManager.Model.Employee;
import com.revature.EmployeeManager.Model.RestaurantEmployee;
import com.revature.EmployeeManager.Model.RestaurantManager;
import com.revature.EmployeeManager.Service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	@GetMapping("/findAll")
	public Iterable<Employee> findAll() {
		return employeeService.findAll();
	}

	@PostMapping("/addEmployee")
	public void addEmployee(@RequestBody Employee emp) {
		employeeService.addEmployee(emp);
	}

	@GetMapping("/findEmployeeByID/{id}")
	public Employee findByID(@PathVariable int id) {
		Employee emp = new Employee();
		return emp = employeeService.findByID(id);
	}

	@RequestMapping("/removeEmployee/{id}")
	public void removeEmployee(@PathVariable int id) {
		employeeService.removeEmployee(id);
	}
	
	@PutMapping("/updateEmployee")
	public void updateEmployee(@RequestBody Employee emp){
		employeeService.updateEmployee(emp);
	}
	
	@GetMapping("/findRestaurantManagersByID/{id}")
	public Iterable<RestaurantManager>findRestaurantManager(@PathVariable int id) {
		return employeeService.findAllRestaurantManager(id);
	}
	
	@GetMapping("/findRestaurantEmployeesByRestaurantID/{id}")
	public Iterable<RestaurantEmployee>findRestaurantEmployees(@PathVariable int id) {
		return employeeService.findAllRestaurantEmployee(id);
	}

}
