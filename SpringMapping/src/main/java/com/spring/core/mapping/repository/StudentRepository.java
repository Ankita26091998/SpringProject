package com.spring.core.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.core.mapping.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
