package com.spring.blog.app.service;

import java.util.List;

import com.spring.blog.app.entity.User;

public interface UserService {
	public User createUser(User user);

	public User updateUser(User user, int id);

	public User getUserById(int id);

	public void deleteUser(int userId);

	public List<User> getUsers();

}
