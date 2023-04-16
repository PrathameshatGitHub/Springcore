package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/collection/NewFile.xml");
        Emp Emp1=(Emp)context.getBean("Emp1");
   System.out.println(Emp1);
   System.out.println(Emp1.getAddresss());
   System.out.println(Emp1.getCourses());
   
   System.out.println(Emp1.getNumbers());
   System.out.println("this is how its done");
   System.out.println(Emp1.getProp());



	}

}
