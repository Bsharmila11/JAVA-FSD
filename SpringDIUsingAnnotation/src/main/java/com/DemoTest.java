package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {

	public static void main(String[] args) {
		/*ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		Address add1=(Address)ac.getBean("address");
		System.out.println(add1);
		Employee emp1=(Employee)ac.getBean("employee");
		System.out.println(emp1);
		add1.setCity("vizag");
		add1.setState("Ap");
		emp1.setAdd(add1);
		emp1.setId(2);
		emp1.setName("anusha");
		emp1.setSalary(22000);
		System.out.println(emp1);
		System.out.println(add1);*/
		//Enable using congigyration class
		
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(MyConfiguration.class);
		Address add1=(Address)ac.getBean("address");
		System.out.println(add1);
		Employee emp1=(Employee)ac.getBean("employee");
		System.out.println(emp1);
		
		Product prod1=(Product)ac.getBean("pp");
		prod1.productInfo();
		
		
	}

}