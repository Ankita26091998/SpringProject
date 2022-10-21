package com.spring.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.core.entity.Employee;
import com.spring.core.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	public Employee addEmployee(Employee employee) {

		return employeeRepo.save(employee);
	}

	public List<Employee> getEmployees() {

		return employeeRepo.findAll();
	}

	public Employee getEmployeeById(int id) {

		return employeeRepo.findById(id).get();
	}

	public void deleteEmployee(int id) {
		Employee emp = new Employee();
		emp.setEmpId(id);
		employeeRepo.delete(emp);

	}

	public Employee updateEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}

	public Employee getEmployee(String empName) throws Exception {
		Employee emp = employeeRepo.findByEmpName(empName);
		if (emp == null) {
			System.out.println("Employee not found");
			throw new Exception("No Employee found !!");
		}

		return emp;

	}
}
