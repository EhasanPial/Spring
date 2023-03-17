package com.springcore.lifecycle;

 
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 
public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/cbean.xml");
		
		context.registerShutdownHook();
		/*
		 * Bean b1 = context.getBean("b1",Bean.class) ; System.out.println(b1);
		 * 
		 * 
		 * 
		 * System.out.println("+++++++++++++++++++++++++++"); Pepsi p1 =
		 * context.getBean("p1",Pepsi.class); System.out.println(p1);
		 */
		
		Example e = context.getBean("e1",Example.class) ; 
		System.out.println(e);
		
	
	}

}
