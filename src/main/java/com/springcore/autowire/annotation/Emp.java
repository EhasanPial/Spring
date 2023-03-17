package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired; 

public class Emp {
	@Autowired
	
	private Address address;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address getAddress() {
		return address;
	}
	@Autowired
	public void setAddress(Address address) {
		System.out.println("setter method");
		this.address = address;
	}
	 
	public Emp(Address address) {
		super();
		System.out.println("constructor method");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	} 
	
	
}
