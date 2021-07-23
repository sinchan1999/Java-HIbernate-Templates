package com.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import com.sinchan.Hibernate.Alien;


public class SecondLevelCache {
	public static void main(String[] args) {
		
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session session1=factory.openSession();
		
		
		/* WE open and closes 3 different sessions but on running it we will see that query fires only 1 times rest 2times we get it from the cache memory.
		So, clearly Second chache is used here. 
		*/
		
		Alien alien1=session1.get(Alien.class, 77099);
		System.out.println(alien1.getAlienId()+" : "+alien1.getAlienName());
		session1.close();
		
		
		Session session2 = factory.openSession();
		Alien alien2=session2.get(Alien.class, 77099);
		System.out.println(alien2.getAlienId()+" : "+alien2.getAlienName());;		
		session2.close();
		
		
		Session session3 = factory.openSession();
		Alien alien3=session3.get(Alien.class, 77099);
		System.out.println(alien3.getAlienId()+" : "+alien3.getAlienName());	
		session3.close();
		

	}

}
