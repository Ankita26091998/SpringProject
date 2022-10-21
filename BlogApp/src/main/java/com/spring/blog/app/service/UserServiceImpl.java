package com.spring.blog.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.blog.app.entity.User;
import com.spring.blog.app.exception.UserNotFoundException;
import com.spring.blog.app.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo userRepo;

	@Override
	public User createUser(User user) {

		return userRepo.save(user);
	}

	@Override
	public User updateUser(User user, int id) {
		User user1 = userRepo.findById(id).orElseThrow((() -> new UserNotFoundException("User not found")));
		user1.setName(user.getName());
		user1.setEmail(user.getEmail());
		user1.setPassword(user.getPassword());
		user1.setAbout(user.getAbout());

		return userRepo.save(user1);
	}

	@Override
	public User getUserById(int id) {

		User user = userRepo.findById(id).get();
		if (user == null) {
			System.out.println("User not found");
			throw new UserNotFoundException("User not found");
		}

		return user;
	}

	@Override
	public void deleteUser(int userId) {
		User user = new User();
		user.setId(userId);
		userRepo.delete(user);
	}

	@Override
	public List<User> getUsers() {
		return userRepo.findAll();
	}

}
