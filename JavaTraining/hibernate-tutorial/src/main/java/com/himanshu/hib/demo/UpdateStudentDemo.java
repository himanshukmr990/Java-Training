package com.himanshu.hib.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.himanshu.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		
		//create session factory
		SessionFactory factory = new Configuration()
				                 .configure("hibernate.cfg.xml")
				                 .addAnnotatedClass(Student.class)
				                 .buildSessionFactory();

		//create session
		Session session = factory.getCurrentSession();
		
		try {
			int studentID = 1; 
			
			//now get a new session and start tx
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			//retrieve student base on the id: primary key
			System.out.println("\nGetting student with id: " + studentID);
			
			Student myStudent = session.get(Student.class, studentID);
			
			System.out.println("Updating student...");
			myStudent.setFirstName("Scooby");
			
			//commit the tx
			session.getTransaction().commit();
			
			//New Code
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			//update email for all students
			System.out.println("Update email for all students");
			
			session.createQuery("Update Student set email='@outlook.com'")
			       .executeUpdate();
			
			//commit the tx
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}
