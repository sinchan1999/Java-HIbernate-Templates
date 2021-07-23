package com.hql;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sinchan.Hibernate.Alien;


public class HqlExample1 {

	public static void main(String[] args) {
		
		Configuration cfg= new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    SessionFactory factory = cfg.buildSessionFactory();
	    Session s =factory.openSession();
	    
	    //HQL
	     String query="FROM Alien WHERE duration='6 months' AND alienName='ZetaaMark-V' " ;
	    //String query="FROM Alien AS a WHERE a.duration=:x AND a.alienName=:n" ;
	    Query q=s.createQuery(query);
	    
	   // q.setParameter("x", "6 months");
	    //q.setParameter("n", "ZetaaMark-V"); // Passing Dyanmic value 
	    
	    List<Alien> list=q.getResultList();
	    
	    System.out.println("\nYour Query result is........");
	    for (Alien alien:list )
	    {
	    	System.out.println(alien.getAlienName()+"  : "+alien.getAlienId());	    	
	    }
	    
	    Transaction tx=s.beginTransaction();
	    
	    //---------->>>DELETE>>>--------
	    
//	    Query q2=s.createQuery("DELETE FROM Alien WHERE alienId='3007'");
//	    int update=q2.executeUpdate();
//	    System.out.println("\nDeleted successfully........ !");
//	    System.out.println("Updated : "+update);
	    
	    
	    //---------->>>UPDATE>>>--------
	    
//	     Query q2=s.createQuery("UPDATE Alien SET alienColor='Green' WHERE alienId='77055' ");
	    
	    Query q2=s.createQuery("UPDATE Alien SET alienColor=:color WHERE alienId=:Id");
	    q2.setParameter("color", "Green");
	    q2.setParameter("Id", 77055);
	    
	    int update=q2.executeUpdate();
	    
	    if(update>0) {
	    System.out.println("\nRows Updated successfully........ !");
	    System.out.println("No.of rows Updated : "+update);
	    }
	    else {
	    	 System.out.println("Failed to Update...!");
	    }
	    
	    
	    tx.commit();		
	    s.close();
	    factory.close();

	}

}
