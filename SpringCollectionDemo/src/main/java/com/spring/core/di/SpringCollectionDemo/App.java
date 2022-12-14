package com.spring.core.di.SpringCollectionDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CollectionDemo cd = (CollectionDemo) context.getBean("collectionDemo");

		cd.getAddressList();
		cd.getAddressSet();
		cd.getAddressMap();
		cd.getAddressProp();

	}
}
