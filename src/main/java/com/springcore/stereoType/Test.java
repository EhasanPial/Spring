package com.springcore.stereoType;

 
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 
public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereoType/cstereo.xml");
		
		StudentClass s = context.getBean("balbal",StudentClass.class) ;
		
		System.out.println(s); 
	
	}

}
