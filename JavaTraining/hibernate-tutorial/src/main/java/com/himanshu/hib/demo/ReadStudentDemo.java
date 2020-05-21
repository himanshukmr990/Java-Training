package com.himanshu.hib.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.himanshu.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
		
		//create session factory
		SessionFactory factory = new Configuration()
				                 .configure("hibernate.cfg.xml")
				                 .addAnnotatedClass(Student.class)
				                 .buildSessionFactory();

		//create session
		Session session = factory.getCurrentSession();
		
		try {
			//use the session object to save Java object
			System.out.println("Creating new student object...");
			Student tempStudent = new Student("Himanshu", "Kumar", "himanshu.kmr990@gmail.com");
			
			//create a student object
			session.beginTransaction();
			
			//start a transaction
			System.out.println("Saving the student...");
			System.out.println(tempStudent);
			session.save(tempStudent);
			
			//commit transaction
			session.getTransaction().commit();
			
			//My new code
			
			//find out the student's id: primary key
			System.out.println("Saved student. Generated id: " + tempStudent.getId());
			
			//now get a new session and start tx
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			//retrieve student base on the id: primary key
			System.out.println("\nGetting student with id: " + tempStudent.getId());
			
			Student myStudent = session.get(Student.class, tempStudent.getId());
			
			System.out.println("Get complete: " + myStudent);
			
			//commit the tx
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}
