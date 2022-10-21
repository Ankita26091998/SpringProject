package com.spring.blog.app.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.blog.app.entity.User;
import com.spring.blog.app.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping("/")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		User user1 = userService.createUser(user);
		return new ResponseEntity<>(user1, HttpStatus.CREATED);

	}

	@PutMapping("/{id}")
	public ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable int id) {
		User user1 = userService.updateUser(user, id);
		return ResponseEntity.ok(user1);

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable int id) {
		userService.deleteUser(id);
		return ResponseEntity.ok(Map.of("message", "User Deleted Successfully"));

	}

	@GetMapping("/")
	public ResponseEntity<List<User>> getUsers() {
		List<User> userList = userService.getUsers();
		return ResponseEntity.ok(userList);

	}

	@GetMapping("/{id}")
	public ResponseEntity<User> getUserById(@PathVariable int id) {
		return ResponseEntity.ok(userService.getUserById(id));

	}
}
