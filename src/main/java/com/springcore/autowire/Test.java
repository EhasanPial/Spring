package com.springcore.autowire;

 
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 
public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/cautowire.xml");
		
		Emp e = context.getBean("emp1",Emp.class) ;
		
		System.out.println(e);
	
	}

}