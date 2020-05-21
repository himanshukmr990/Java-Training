package com.himanshu.DemoHib;

import java.nio.channels.SeekableByteChannel;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
//        AlienName an = new AlienName();
//        an.setFname("Himanshu");
//        an.setLname("Singh");
//        an.setMname("Kumar");
//    	
//    	Alien hib = new Alien();
//        hib.setAid(103);
//        hib.setAname("Himanshu Kumar");
//        hib.setColor("Red");
    	
        Alien a = null;
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
        
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();     
        
        SessionFactory sf = con.buildSessionFactory(reg);
        
        Session session = sf.openSession();
        
        
        
        Transaction tx = session.beginTransaction();
//       session.save(hib);
//        
        Query q1 = session.createQuery("from Alien where aid=101");
        
//        a = (Alien) session.get(Alien.class, 101);
        q1.setCacheable(true);
        a= (Alien) q1.uniqueResult();
        System.out.println(a);
        
        tx.commit();
        session.close();
        
        Session session2 = sf.openSession();
        session2.beginTransaction();
        
        Query q2 = session2.createQuery("from Alien where aid=101");
//        a = (Alien) session2.get(Alien.class, 101);
        q2.setCacheable(true);
        a = (Alien) q2.uniqueResult();
        System.out.println(a);
        
        session2.getTransaction().commit();
        session2.close();
        
       
    }
}
