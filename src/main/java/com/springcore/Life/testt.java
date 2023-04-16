package com.springcore.Life;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


import com.springcore.collection.Emp;

public class testt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/Life/Lifeconfig.xml");
        //Book book1=(Book)context.getBean("book1");
        //System.out.println(book1);
        //context.registerShutdownHook();
        pepsi pep=(pepsi)context.getBean("p1");
        System.out.println(pep);
	}

}
