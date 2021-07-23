package com.pegination;

/*To divide large number of records into multiple parts, we use pagination. It allows user to display a part of records only. 
 * Loading all records in a single page may take time, so it is always recommended to created pagination
 */


import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sinchan.Hibernate.Alien;


public class HQLPegination {

	public static void main(String[] args) {
		
		Configuration cfg= new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    SessionFactory factory = cfg.buildSessionFactory();
	    Session s =factory.openSession();
	    
	    Query query=s.createQuery("FROM Alien");
	    
	    // Implementing pegination using hibernate	
	    
	    query.setFirstResult(2); // Staring Row no.
	    query.setMaxResults(4);  // Upto which or how many no.of results per page.(Page size)
	    
	    List<Alien> list=query.getResultList();
	    
	    System.out.println("\nYour result after pegination.........\n");
	    
	    for(Alien st:list)
	    {
	    	System.out.println(st.getAlienId()+" : "+ st.getAlienName()+" : "+ st.getAlienColor());
	    }
	    
	    s.close();
	    factory.close();

	}

}
