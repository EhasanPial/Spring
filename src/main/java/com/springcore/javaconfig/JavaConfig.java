package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public Pepsi getPepsi() {
		return new Pepsi() ;
	}
	@Bean(name = {"student","temp","con"})
	public Student getStudent() {
		return new Student(getPepsi()) ;
	}
	
}
