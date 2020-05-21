package com.himanshu.hib.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.himanshu.hibernate.demo.entity.Instructor;
import com.himanshu.hibernate.demo.entity.InstructorDetail;
import com.himanshu.hibernate.demo.entity.Student;

public class DeleteInstructorDetailDemo {

	public static void main(String[] args) {
		
		//create session factory
		SessionFactory factory = new Configuration()
				                 .configure("hibernate.cfg.xml")
				                 .addAnnotatedClass(Instructor.class)
				                 .addAnnotatedClass(InstructorDetail.class)
				                 .buildSessionFactory();

		//create session
		Session session = factory.getCurrentSession();
		
		try {
			
			//create a student object
			session.beginTransaction();
			
			//get the instructor detail object
			int theId = 3;
			InstructorDetail tempInstructorDetail = session.get(InstructorDetail.class, theId);
			
			//print the instructor detail
			System.out.println("tempInstructorDeatilt: " + tempInstructorDetail);
			
			//print the associated instructor
			System.out.println("the associated instructor: " + tempInstructorDetail.getInstructor());
			
			//now lets delete the instructor detail
			System.out.println("Deleting tempInstructorDetail: " + tempInstructorDetail.getInstructor());
			session.delete(tempInstructorDetail);
			
			//remove the associated object reference
			//break bi-direction link
			
			tempInstructorDetail.getInstructor().setInstructorDetail(null);
			session.delete(tempInstructorDetail);
			
			//commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			factory.close();
		}
	}

}
