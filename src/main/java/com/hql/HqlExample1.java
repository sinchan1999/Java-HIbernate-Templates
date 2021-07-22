package com.hql;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sinchan.Hibernate.Alien;

public class HqlExample1 {

	public static void main(String[] args) {
		
		Configuration cfg= new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    SessionFactory factory = cfg.buildSessionFactory();
	    Session s =factory.openSession();
	    
	    //HQL
	    String query="from Alien" ;
	    Query q=s.createQuery(query);
	    
	    List<Alien> list=q.getResultList();
	    
	    System.out.println("\nYour Query result is........");
	    for (Alien alien:list )
	    {
	    	System.out.println(alien.getAlienName());	    	
	    }
	    
	    s.close();
	    factory.close();

	}

}
