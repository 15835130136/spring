package com.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.Axe;
import com.demo.Person;

public class DemoTest {
	public static void lastTest(Person person,Axe axe) {
		person.useAxe();
	}
	public static  void injectionTest() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans/beans.xml");
		Person person = context.getBean("chinese",Person.class);
		person.useAxe();
		
	}
	public static void main(String[] args) {
		DemoTest.injectionTest();
	}
	
	
}
