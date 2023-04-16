package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collection.Emp;

public class test {
	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/ci/CiConfig.xml");
		person per=(person)context.getBean("person1");
        System.out.println(per);
        System.out.println(per);
        System.out.println("this is constuctor innjection");
        Addition add1=(Addition)context.getBean("add1");
        System.out.println(add1.sum());
         
        
         
                 
	}

}
