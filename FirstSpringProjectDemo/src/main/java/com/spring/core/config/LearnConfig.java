package com.spring.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.core.service.LearnerService;

//@Configuration annotation tells Spring container that 
//there are one or more beans that need to be dealt with on runtime.

@Configuration
public class LearnConfig {
//	@Bean is used to explicitly declare a single bean, rather than letting Spring do it automatically. It decouples the declaration of the bean from the class definition 
//	and lets you create and configure beans exactly how you choose.
//	@Bean is a method-level annotation

	
	@Bean(name= {"bean1"})
	public LearnerService getLearner() {
		return new LearnerService();}
	

}
