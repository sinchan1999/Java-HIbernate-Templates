package com.map;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;


public class FetchMappingData {
	public static void main(String[] args) {
		
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
	    SessionFactory factory = cfg.buildSessionFactory();
	    Session sess=factory.openSession();
	    
	     // Fetching data for OneToMany	       
	       
	       Question ques=(Question)sess.get(Question.class, 1207);
		    
	       System.out.println("\nPlease wait we are fetching your data ..........");
	       
		   System.out.println(ques.getQuestion());		    
		    for(Answer a:ques.getAnswers())
		    {
		    	System.out.println(a.getAnswer());
		    
		    }    
	    sess.close();
	    factory.close();
		
	}

}
