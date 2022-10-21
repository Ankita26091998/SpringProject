package com.spring.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.core.entity.Department;
import com.spring.core.entity.Employee;
import com.spring.core.service.DepartmentService;
import com.spring.core.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private DepartmentService departmentService;

	@PostMapping("/add/{id}")
	public String createEmployee(@RequestBody Employee employee, @PathVariable int id) {
		Department d = departmentService.getDepartmentById(id);
		employee.setDepartment(d);
		employeeService.addEmployee(employee);
		return "Employee added Successfully";
	}

	@GetMapping("/employees")
	public List<Employee> getEmployees() {

		return employeeService.getEmployees();
	}

	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable int id) {

		return employeeService.getEmployeeById(id);
	}

	@GetMapping("/employees/{empName}")
	public Employee getEmployeeByName(@PathVariable String empName) throws Exception {

		return employeeService.getEmployee(empName);
	}

	@PutMapping("/update/{id}")
	public Employee updateEmployee(@RequestBody Employee employee, @PathVariable int id) {
		Department d = departmentService.getDepartmentById(id);
		employee.setDepartment(d);
		return employeeService.updateEmployee(employee);
	}

	@DeleteMapping("/employee/{empId}")
	public String deleteEmployee(@PathVariable int empId) {
		employeeService.deleteEmployee(empId);
		return "Employee deleted Successfully";

	}
}
