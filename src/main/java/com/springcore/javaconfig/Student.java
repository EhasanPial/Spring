package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

 
public class Student {
	
	private Pepsi pep;
	public void study() {
		pep.display();
		System.out.println("studying...........");

	}
	public Pepsi getPep() {
		return pep;
	}
	public void setPep(Pepsi pep) {
		this.pep = pep;
	}
	public Student(Pepsi pep) {
		super();
		this.pep = pep;
	}
	
}
