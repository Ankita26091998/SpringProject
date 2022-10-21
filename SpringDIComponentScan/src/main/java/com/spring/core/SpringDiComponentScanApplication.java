package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDiComponentScanApplication {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		College c = (College) context.getBean("college", College.class);
		System.out.println(c.getData());

	}

}
