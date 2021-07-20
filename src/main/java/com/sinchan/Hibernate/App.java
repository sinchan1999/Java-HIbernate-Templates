package com.sinchan.Hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory; 
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      
    
       Configuration cfg= new Configuration();
       cfg.configure("hibernate.cfg.xml");
       SessionFactory factory = cfg.buildSessionFactory();
       //System.out.println(factory);
       //System.out.println(factory.isClosed());
       
       
        Alien saikat=new Alien();
       saikat.setAlienId(3007);
       saikat.setAlienName("NEBUULA");
       saikat.setAlienColor("Blue");
       System.out.println(saikat);
       
       Session session= factory.openSession();
       
       Transaction tx=session.beginTransaction();
       session.save(saikat);
       
       tx.commit();
       
       session.close();          	
    	
    	
    }
}
