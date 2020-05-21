package com.himanshu.JpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");	
    	EntityManager em = emf.createEntityManager();
        
    	Student s = em.find(Student.class,4);
    	
    	System.out.println(s);
    }
}
