package com.spring.core.SpringDIDemo;

public class Address {

	private String city;
	private String state;
	private String country;

	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public String showDetails() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + "]";
	}

}
