package com.springcore.ci;

public class Person {
	private String name;
	private int personId;
	private Certificate certi;
	public Person(String name, int personId, Certificate certi) {
		super();
		this.name = name;
		this.personId = personId;
		this.certi = certi;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ", certi=" + certi + "]";
	}
	 
	
	
}
