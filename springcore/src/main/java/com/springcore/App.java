package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/config.xml");
        Student ct1 = (Student) context.getBean("student1");
        Student ct2 = (Student) context.getBean("student2");
        System.out.println(ct1);
        System.out.println(ct2);
 
    }
}
