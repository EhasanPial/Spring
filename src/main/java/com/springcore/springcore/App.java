package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student s = context.getBean("Student1",Student.class);
		Student s2 = context.getBean("Student2",Student.class);

		
		System.out.println(s);
		System.out.println(s2);
	}
}
