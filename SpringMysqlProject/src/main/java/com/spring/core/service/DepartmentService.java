package com.spring.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.core.entity.Department;
import com.spring.core.repo.DepartmentRepo;

@Service
public class DepartmentService {

	@Autowired
	DepartmentRepo departmentRepo;

	public Department addDept(Department dept) {
		return departmentRepo.save(dept);

	}

	public List<Department> getDepartments() {
		return departmentRepo.findAll();
	}

	public Department getDepartmentById(int id) {
		return departmentRepo.findById(id).get();
	}

	public Department getDepartmentByName(String deptName) {
		return departmentRepo.findByDeptName(deptName);

	}

	public Department updateDepartment(Department department) {
		return departmentRepo.save(department);
	}

	public void deleteDepartment(int deptId) {
		Department dept = new Department();
		dept.setDeptId(deptId);
		departmentRepo.delete(dept);

	}

}
