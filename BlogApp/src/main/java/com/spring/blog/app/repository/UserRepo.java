package com.spring.blog.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.blog.app.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
