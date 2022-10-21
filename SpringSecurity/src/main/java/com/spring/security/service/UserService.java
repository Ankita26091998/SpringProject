package com.spring.security.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.security.model.User;

@Service
public class UserService {

	List<User> userList = new ArrayList<>();

	public UserService() {
		userList.add(new User("Ankita@1998", "Ankita", "ankita@gmail.com"));
		userList.add(new User("Nikita@1998", "Nikita", "nikita@gmail.com"));

	}

	public List<User> getAllUsers() {
		return userList;
	}

	public User getUserByUsername(String username) {
		return userList.stream().filter((user) -> user.getUsername().equals(username)).findAny().orElse(null);
	}

	public User addUser(User user) {
		userList.add(user);
		return user;
	}
}
