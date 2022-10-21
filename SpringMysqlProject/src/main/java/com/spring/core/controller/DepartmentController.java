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
import com.spring.core.service.DepartmentService;

@RestController
@RequestMapping("/dept")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@PostMapping("/add")
	public String createDept(@RequestBody Department dept) {

		departmentService.addDept(dept);
		return "Department added Successfully";
	}

	@GetMapping("/departments")
	public List<Department> getDepartments() {

		return departmentService.getDepartments();
	}

	@GetMapping("/department/{id}")
	public Department getDepartmentById(@PathVariable int id) {

		return departmentService.getDepartmentById(id);
	}

	@GetMapping("/departments/{deptName}")
	public Department getDepartmentByName(@PathVariable String deptName) {

		return departmentService.getDepartmentByName(deptName);
	}

	@PutMapping("/update")
	public Department updateDepartment(@RequestBody Department department) {
		return departmentService.updateDepartment(department);
	}

	@DeleteMapping("/department/{empId}")
	public String deleteDepartment(@PathVariable int deptId) {
		departmentService.deleteDepartment(deptId);
		return "Department deleted Successfully";

	}
}
