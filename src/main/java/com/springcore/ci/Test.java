package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("com/springcore/ci/cci.xml") ;
		Person p = context.getBean("p1",Person.class);
		System.out.println(p);

	}

}
