package com.sinchan.Hibernate;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory; 
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class addressApp
{
    public static void main( String[] args )throws IOException
    {
      
    
       Configuration cfg= new Configuration();
       cfg.configure("hibernate.cfg.xml");
       SessionFactory factory = cfg.buildSessionFactory();
       
       
       // Creating object of address Class
       Address ad = new Address();
       ad.setStreet("NH127-B");
       ad.setCity("Coorg");
       ad.setOpen(true);
       ad.setAddedDate(new Date());
       ad.setX(22.77);
       
       // Reading Image
       FileInputStream img=new FileInputStream("src/main/java/manyHouses.jpg");
       byte[] data=new byte[img.available()];
       img.read(data);
       ad.setImage(data);
       
       Session session= factory.openSession();
       
       Transaction tx=session.beginTransaction();
       session.save(ad);
       
       tx.commit();       
       session.close(); 
       
       System.out.println("Processing Done......!!!");
    	
    	
    }
}
