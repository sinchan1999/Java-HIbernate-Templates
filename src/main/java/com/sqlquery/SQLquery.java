package com.sqlquery;

import java.util.Arrays;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;


public class SQLquery {

	public static void main(String[] args) {
		
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session s =factory.openSession();
		
		//SQL Query
		String q="SELECT * FROM Alien";
		
		NativeQuery nq = s.createSQLQuery(q);
		
		// Getting array of objects inside List. 
		List<Object[]> list=nq.getResultList();
		
		 System.out.println("\nExecuting your SQL query.........\n");
		for(Object[] alien:list) // Taking out each object array and then printing.
	    {
	    	System.out.println(Arrays.deepToString(alien));
	    }
		
		System.out.println("\nPrinting only Id and Name.........\n");
		for(Object[] alien:list)
	    {
	    	System.out.println(alien[0]+" : "+alien[2]);
	    }
		
		s.close();
		factory.close();

	}

}
