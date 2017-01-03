package com.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("application-context.xml");
		Message message=(Message)context.getBean("message");
		System.out.println(message.getMsg());

	}

}
