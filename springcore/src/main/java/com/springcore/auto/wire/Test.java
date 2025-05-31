package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/autowire.xml");
		Emp e1 = context.getBean("emp1", Emp.class);
		System.out.println(e1);
		System.out.println(e1.getAddress().getStreet());
		System.out.println(e1.getAddress().getCity());

	}

}
