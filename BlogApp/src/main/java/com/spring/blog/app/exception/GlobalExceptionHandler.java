package com.spring.blog.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<String> usernNotFoundException(UserNotFoundException ex) {

		return new ResponseEntity<String>("User not present in DB", HttpStatus.NOT_FOUND);
	}
}
