package com.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory; 
import org.hibernate.cfg.Configuration;

import com.sinchan.Hibernate.Alien;


public class FirstLevelCache {

	public static void main(String[] args) {
		
		Configuration cfg= new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    SessionFactory factory = cfg.buildSessionFactory();
	    
	    Session session = factory.openSession();
		
	    Alien alien=session.get(Alien.class, 77077);
	    System.out.println(alien.getAlienId()+" : "+alien.getAlienName());
	    
	    System.out.println("\nNow for printing again Hibernate will simply fetching it from cache memory that is created by default.........\n");
	    System.out.println(alien.getAlienId()+" : "+alien.getAlienName());
	    
	    // To check whether any object of Alien is present in cache memory or not.
	    System.out.println(session.contains(alien));
	    
	    session.close();
	    
	    

	}

}
