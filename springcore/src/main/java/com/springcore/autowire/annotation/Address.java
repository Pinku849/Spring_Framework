package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Qualifier;

public class Address {
	
	private String street;
	private String city;
	
	public Address(String street, String city) {
		super();
		this.street = street;
		this.city = city;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}

}
