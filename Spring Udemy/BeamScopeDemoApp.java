package com.samson;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeamScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring config file
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);

		//check if they are same bean
		boolean result = (theCoach == alphaCoach);
		
		//print out the result
		System.out.println("\n pointing to the same object: " + result);
		
		System.out.println("\n Memory Location for the Coach:" + theCoach);
		
		System.out.println("\n Memory Location for the AplhaCoach:" + alphaCoach + "\n");
		
		//close the context
		context.close();
	}

}
