package com.cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory; 
import org.hibernate.cfg.Configuration;

import com.map.Answer;
import com.map.Question;
	

public class Cascade {

	public static void main(String[] args) {
	     
    
       Configuration cfg= new Configuration();
       cfg.configure("hibernate.cfg.xml");
       SessionFactory factory = cfg.buildSessionFactory();
          
       
       
     //-------------->>>>>OneToMany<<<<<<<----------------	
       
    // Creating Question objects
       Question q1=new Question();
       q1.setQuestionId(1277);
       q1.setQuestion("Your thought on Python");
       
       
    // Creating 3 different Answer objects
       Answer answer=new Answer();
       answer.setAnswerId(990055);
       answer.setAnswer("1: Python has a rich library collection");
       answer.setQuestion(q1);
       
       
       
       Answer answer1=new Answer();
       answer1.setAnswerId(990077);
       answer1.setAnswer("2: Very useful for Data Science");
       answer1.setQuestion(q1);
       
       
       Answer answer2=new Answer();
       answer2.setAnswerId(990099);
       answer2.setAnswer("3: Still need lot of improvement in speed! ");
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
       
     // Saving ONLY question. Due to cascading answers will get saved automatically.
       sess.save(q1);
       
       tx.commit(); 
       
            
       sess.close();   
       factory.close();  
       
       System.out.println("\nSaved successfully.........!!!\n");
       
       
  }
	
}
	
