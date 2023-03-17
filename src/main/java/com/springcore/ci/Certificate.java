package com.springcore.ci;

public class Certificate {
	private String nameOf;
	
	//public Certificate() {}

	public Certificate(String name) {
		super();
		this.nameOf = name;
	}

	@Override
	public String toString() {
		return "Certificate [name=" + nameOf + "]";
	}

	 
}
