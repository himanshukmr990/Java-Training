package com.himanshu.hib.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.himanshu.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {
  
	public static void main(String[] args) {
		//create session factory
				SessionFactory factory = new Configuration()
						                 .configure("hibernate.cfg.xml")
						                 .addAnnotatedClass(Student.class)
						                 .buildSessionFactory();

				//create session
				Session session = factory.getCurrentSession();
				
				try {
					//create 3 student objects
					System.out.println("Creating 3 student object...");
					Student tempStudent1 = new Student("Sunny", "Kumar", "sk08@gmail.com");
					Student tempStudent2 = new Student("Ravi", "Singh", "ravi12@gmail.com");
					Student tempStudent3 = new Student("Amit", "Chopra", "amit9870@gmail.com");
					
					//create a student object
					session.beginTransaction();
					
					//start a transaction
					System.out.println("Saving the student...");
					session.save(tempStudent1);
					session.save(tempStudent2);
					session.save(tempStudent3);
					
					//commit transaction
					session.getTransaction().commit();
					
					System.out.println("Done!");
				}
				finally {
					factory.close();
				}
	}
}
