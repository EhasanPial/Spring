package com.spring.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	 public static void main(String[] agrs) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/collections/collectionConfig.xml"); 
		Employee emp1 = context.getBean("emp1",Employee.class);
		System.out.println(emp1.getName());
		System.out.println(emp1.getPhones());
	 }
}
