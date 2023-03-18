package com.springcore.spel;

 
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

 
public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/cspel.xml");
		
		Demo d = context.getBean("demo",Demo.class) ;
		
		System.out.println(d); 
		
		SpelExpressionParser temp = new SpelExpressionParser();
		Expression ex=temp.parseExpression("22+44") ;
		System.out.println(ex.getValue());
	
	}

}
