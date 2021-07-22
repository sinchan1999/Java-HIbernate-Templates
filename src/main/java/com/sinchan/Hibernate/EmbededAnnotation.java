package com.sinchan.Hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory; 
import org.hibernate.cfg.Configuration;
public class EmbededAnnotation {
	
	public static void main(String[] args) {
		
		 Configuration cfg= new Configuration();
	     cfg.configure("hibernate.cfg.xml");
	     SessionFactory factory = cfg.buildSessionFactory();
	     
	     Alien alien1=new Alien();
	     
	     alien1.setAlienId(770044);
	     alien1.setAlienName("Kaapaa-II");
	     alien1.setAlienColor("Grey");
	     
	     Certificate certificate=new Certificate();
	     certificate.setCourse("Moon-Research");
	     certificate.setDuration("3 months");
	     
	     alien1.setCerti(certificate);
	     
	     Session s=factory.openSession();
	     Transaction tx=s.beginTransaction();
	     
	     // Saving objects
	     s.save(alien1);
	     
	     
	     tx.commit();	     
	     s.close();	     
	     factory.close();
		
	}

}
