package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext con =  new ClassPathXmlApplicationContext("com/springcore/stereotype/stereotype.xml");
		Person p = con.getBean("person", Person.class );
		
		System.out.println(p);
		

	}

}
