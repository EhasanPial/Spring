package com.springcore.stereoType;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("balbal")
@Scope("prototype")
class StudentClass { 
	@Value("Pial")
	private String studentName;
	
	@Value("Dinajpur")
	private String city;
	
	@Value("#{temp}")
	private List<String> address;
	
	public String getStudentName() {
		return studentName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "StudentClass [studentName=" + studentName + ", city=" + city + ", address=" + address + "]";
	}
	 
	
}
