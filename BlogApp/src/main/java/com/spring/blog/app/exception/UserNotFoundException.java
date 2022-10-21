package com.spring.blog.app.exception;

public class UserNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;

	public UserNotFoundException(String msg) {
		super();
		this.msg = msg;
	}

}
