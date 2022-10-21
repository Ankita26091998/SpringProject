package com.spring.core.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.core.entity.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer> {

	Department findByDeptName(String deptName);

}
