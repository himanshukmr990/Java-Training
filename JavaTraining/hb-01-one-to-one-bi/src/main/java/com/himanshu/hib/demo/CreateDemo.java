package com.himanshu.hib.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.himanshu.hibernate.demo.entity.Instructor;
import com.himanshu.hibernate.demo.entity.InstructorDetail;
import com.himanshu.hibernate.demo.entity.Student;

public class CreateDemo {

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
//			Instructor tempInstructor = new Instructor("Himanshu", "Kumar", "hima@gmail.com");
//			
//			InstructorDetail tempInstructorDetail = new InstructorDetail("http://www.himanshu.com/youtube", "Love coding");
			
            Instructor tempInstructor = new Instructor("Sunny", "Kumar", "sunny@gmail.com");
			
			InstructorDetail tempInstructorDetail = new InstructorDetail("http://www.sunny.com/youtube", "");
			
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			
			//create a student object
			session.beginTransaction();
			
			System.out.println("Saving instructor: " + tempInstructor);
			session.save(tempInstructor);
			
			//commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}
