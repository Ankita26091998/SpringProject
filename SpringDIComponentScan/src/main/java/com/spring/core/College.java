package com.spring.core;

import org.springframework.stereotype.Component;

@Component("college")
public class College {

	public String getData() {
		return "Inside College";
	}

}
