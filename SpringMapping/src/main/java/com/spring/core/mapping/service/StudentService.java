package com.spring.core.mapping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.core.mapping.entity.Student;
import com.spring.core.mapping.exception.StudentNotFoundException;
import com.spring.core.mapping.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}

	public List<Student> getStudents() {
		return studentRepository.findAll();
	}

	public Student getStudentById(int id) throws StudentNotFoundException {
		Student s = studentRepository.findById(id).get();
		if (s == null) {
			throw new StudentNotFoundException();
		}

		return s;
	}

	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	public void deleteStudent(int id) {
		Student s = new Student();
		s.setStudentId(id);
		studentRepository.delete(s);
	}

}
