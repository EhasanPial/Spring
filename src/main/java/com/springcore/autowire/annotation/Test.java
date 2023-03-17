package com.springcore.autowire.annotation;

 
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 
public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/annotation/cautowire.xml");
		
		Emp e = context.getBean("emp1",Emp.class) ;
		
		System.out.println(e);
	
	}

}
