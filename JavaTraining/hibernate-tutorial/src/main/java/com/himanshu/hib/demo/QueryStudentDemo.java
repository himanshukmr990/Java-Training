package com.himanshu.hib.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.himanshu.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
		
		//create session factory
		SessionFactory factory = new Configuration()
				                 .configure("hibernate.cfg.xml")
				                 .addAnnotatedClass(Student.class)
				                 .buildSessionFactory();

		//create session
		Session session = factory.getCurrentSession();
		
		try {
			
			//create a student object
			session.beginTransaction();
			
		    //query students
			List<Student> theStudents = session.createQuery("from Student").getResultList();
			
			//display the students
			displayStudents(theStudents);
			
			//query students: lastname ='Kumar'
			theStudents = session.createQuery("from Student s where s.lastName = 'Kumar'").getResultList();
			
			System.out.println("\n\nStudents who have last name of Kumar");displayStudents(theStudents);
			
			//query students:lastNAme='Kumar' Or firstName='Himanshu'
			theStudents = session.createQuery("from Student s where" + 
			                      " s.lastName = 'Kumar'").getResultList();
			System.out.println("\n\nStudents who have last name of Kumar Or first anme Himanshu");
			displayStudents(theStudents);
			
			//query students where email LIKE "%gmail.com"
			theStudents = session.createQuery("from Student s where" + 
                    " s.email LIKE '%gmail.com'").getResultList();
			System.out.println("\n\nStudent who email ends with @gmail.com");
			displayStudents(theStudents);

			
			//commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

	private static void displayStudents(List<Student> theStudents) {
		for(Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}

}
