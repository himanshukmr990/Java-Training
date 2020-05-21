package com.himanshu.HibDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Random;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.Map;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
		/*
		 * Laptop laptop = new Laptop(); laptop.setLid(101); laptop.setLname("Dell");
		 * 
		 * Student s = new Student(); s.setName("Himanshu"); s.setRollno(1);
		 * s.setMarks(50); // s.setLaptop(laptop); s.getLaptop().add(laptop);
		 * 
		 * laptop.getStudent().add(s);
		 */
    	
		/*
		 * Laptop1 laps = new Laptop1(); laps.setLid(102); laps.setBrand("Dell");
		 * laps.setPrice(1000);
		 * 
		 * Alien a = new Alien(); a.setAid(2); a.setAname("Rahul");
		 * 
		 * a.getLaps().add(laps);
		 */
    	
        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
        
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();     
        
        SessionFactory sf = con.buildSessionFactory(reg);
        
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        		
//		session.save(laps); 
//		session.save(a);
		 
//        Alien a1 = (Alien) session.get(Alien.class,1);
//        
//        System.out.println(a1.getAname());
//        Collection<Laptop1> laps = a1.getLaps();
//        
//        for(Laptop1 l: laps)
//        {
//        	System.out.println(l);
//        }
//        Native Query
        SQLQuery q = session.createSQLQuery("select name,marks from Student where marks>60");
//        q.addEntity(Student.class);
        q.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
        List students = q.list();
        
        for(Object s: students)
        {
        	HashMap<Object, Object> m = (HashMap<Object, Object>) s;
        	System.out.println(m.get("name") + " : " + m.get("marks"));
        }
        
        
        tx.commit();
    }
}
