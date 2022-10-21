package com.spring.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.core.config.LearnConfig;
import com.spring.core.service.LearnerService;

@SpringBootApplication
public class FirstSpringProjectDemoApplication {

	public static void main(String[] args) {

	       ApplicationContext context=new AnnotationConfigApplicationContext(LearnConfig.class);
	      // LearnerService l=context.getBean(LearnerService.class);
	       
	       LearnerService l=(LearnerService) context.getBean("bean1");

	      System.out.println( l.getLearnerList());

	}

}
