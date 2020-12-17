package com.springdemo.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass {
	
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		
	}

}
