package com.spring.core.SpringDIDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp = context.getBean("Emp", Employee.class);
		System.out.println(emp.show());

	}
}
