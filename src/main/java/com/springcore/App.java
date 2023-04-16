package com.springcore;

/**
 * Hello world!
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello    " );
        ApplicationContext context= new ClassPathXmlApplicationContext("Config.xml");
         Student student1=(Student)context.getBean("student1");
    System.out.println(student1);
    Student student2=(Student)context.getBean("student2");
    System.out.println(student2);
    
    Student student3=(Student) context.getBean("student3");
    System.out.println(student3);
    
    Teacher teacher=(Teacher)context.getBean("teacher");
    System.out.println(teacher);
    System.out.println(teacher.getNumber());
    System.out.println(teacher.getMessege());
    System.out.println("im so happy ");
  
    
    
    
    }
}
