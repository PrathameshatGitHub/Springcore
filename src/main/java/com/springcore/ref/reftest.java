package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collection.Emp;

public class reftest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
        B Bref=(B)context.getBean("Bref");
        A Aref=(A)context.getBean("Aref");
        System.out.println(Bref.getX());
        System.out.println(Bref);
        System.out.println(Aref);
	}

}
