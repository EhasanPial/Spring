package com.springcore.standalone.collections;

 
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 
public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/cstandalone.xml");
		
		Person e = context.getBean("person1",Person.class) ;
		
		System.out.println(e);
		System.out.println("-------------------------------");
		System.out.println(e.getFeeStruct());
	
	}

}
