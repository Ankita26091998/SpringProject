package com.spring.core.SpringDIDemo;

public class Employee {

	private Address address;
	private int id;
	private String name;

	public Employee(Address address, int id, String name) {
		super();
		this.address = address;
		this.id = id;
		this.name = name;
	}

	public String show() {
		return "Employee [address=" + address.showDetails() + ", id=" + id + ", name=" + name + "]";
	}

}
