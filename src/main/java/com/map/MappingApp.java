package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory; 
import org.hibernate.cfg.Configuration;

public class MappingApp {
	
	public static void main( String[] args )
    {     
    
       Configuration cfg= new Configuration();
       cfg.configure("hibernate.cfg.xml");
       SessionFactory factory = cfg.buildSessionFactory();
       
    // ------>>>>OnetoOne>>>>-------
       
      /* // Creating Question objects
       Question q1=new Question();
       q1.setQuestionId(1204);
       q1.setQuestion("What is your Name ?");
       
       //Creating Answer objects
       Answer answer=new Answer();
       answer.setAnswerId(2277);
       answer.setAnswer("SINCHAN PANDA");
       
     //  answer.setQuestion(q1);  // Setting Question for respective ans. to make it Bi-directional
       q1.setAnswer(answer);        
       
       
       //Creating Question objects
       Question q2=new Question();
       q2.setQuestionId(1211);
       q2.setQuestion("What is RollNo. ?");
       
       //Creating Answer objects
       Answer answer1=new Answer();
       answer1.setAnswerId(2299);
       answer1.setAnswer("17005544");
       
      // answer1.setQuestion(q2);  // Setting Question for respective ans. to make it Bi-directional
       q2.setAnswer(answer1);        
         
       
       // Session
       Session sess = factory.openSession();
       Transaction tx=sess.beginTransaction();
       
       // Saving data
       sess.save(q1);
       sess.save(q2);
       sess.save(answer);
       sess.save(answer1);      
       
       
       tx.commit();
       
       // Fetching Data
       System.out.println("Please wait Fetching yout data.......");
       
       Question newQues=(Question)sess.get(Question.class, 1204);
       System.out.println(newQues.getQuestion());
       System.out.println(newQues.getAnswer().getAnswer());
       sess.close();   
       factory.close(); */
       
       
       
     //-------------->>>>>OneToMany<<<<<<<----------------	
       
    // Creating Question objects
       Question q1=new Question();
       q1.setQuestionId(1227);
       q1.setQuestion("Do we you love JAVA? If so then WHY?");
       
       
    // Creating 3 different Answer objects
       Answer answer=new Answer();
       answer.setAnswerId(880055);
       answer.setAnswer("1: JAVA is best");
       answer.setQuestion(q1);
       
       
       
       Answer answer1=new Answer();
       answer1.setAnswerId(880077);
       answer1.setAnswer("2: JAVA still runs on 3billion+ devices");
       answer1.setQuestion(q1);
       
       
       Answer answer2=new Answer();
       answer2.setAnswerId(880099);
       answer2.setAnswer("3: JAVA is extensively used in Industries ");
       answer2.setQuestion(q1);
       
    // Adding differrent answers in Answer List   
       List<Answer> list=new ArrayList<Answer>();
       list.add(answer);
       list.add(answer1);
       list.add(answer2);
       
    // Setting many answers to question q1. 
       q1.setAnswers(list);
       
    // Session
       Session sess = factory.openSession();
       Transaction tx=sess.beginTransaction();
       
     // Saving
       sess.save(q1);
       sess.save(answer);
       sess.save(answer1);
       sess.save(answer2);
       
       tx.commit(); 
       
            
       sess.close();   
       factory.close();          
       
       
  }
	
}
	
