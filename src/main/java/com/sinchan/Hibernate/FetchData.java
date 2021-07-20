package com.sinchan.Hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

public class FetchData {
	public static void main(String[] args) {
		
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
	    SessionFactory factory = cfg.buildSessionFactory();
	    Session session=factory.openSession();
	    
	    Alien alien=(Alien)session.get(Alien.class,3011);
	    
	    Address add=(Address)session.load(Address.class, 2);
	    
	    System.out.println(alien.getAlienName());
	    //System.out.println(alien);
	   System.out.println(add.getStreet()+" : "+add.getCity());
	    
	    session.close();
	    factory.close();
		
	}

}
