package com.spring.core.mapping.controller;

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

import com.spring.core.mapping.entity.Student;
import com.spring.core.mapping.entity.Trainer;
import com.spring.core.mapping.exception.StudentNotFoundException;
import com.spring.core.mapping.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/add")
	public Student createStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}

	@GetMapping("/students")
	public List<Student> getAllStudents() {
		return studentService.getStudents();
	}

	@GetMapping("/students/{id}")
	public Student getStudentById(@PathVariable int id) throws StudentNotFoundException {
		return studentService.getStudentById(id);
	}

	@PutMapping("/update/{id}")
	public Student updateStudent(@RequestBody Student student, @PathVariable int id) {
		Trainer t = new Trainer();
		t.setTrainerId(id);
		return studentService.updateStudent(student);
	}

	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable int id) {
		studentService.deleteStudent(id);
		return "Student deleted Successfully";

	}

}
