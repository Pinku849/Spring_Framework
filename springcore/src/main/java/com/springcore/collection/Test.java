package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collection/collectionConfig.xml");
		Emp emp = (Emp) context.getBean("emp1");
		
//		System.out.println(emp);
		
		System.out.println(emp.getName());
		System.out.println(emp.getPhones());
		System.out.println(emp.getAddress());
		System.out.println(emp.getCourse());

	}

}
