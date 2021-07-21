package manyTomanyMapping;

import java.util.ArrayList;
import java.util.List;



import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

public class MappingManyToMany {
	
public static void main(String[] args) {
		
	Configuration cfg= new Configuration();
    cfg.configure("hibernate.cfg.xml");
    SessionFactory factory = cfg.buildSessionFactory();
    
    Emp e1=new Emp();
    Emp e2=new Emp();
    Emp e3=new Emp();
    
    e1.setEmpId(177);
    e1.setName("Mahesh");
    
    e2.setEmpId(188);
    e2.setName("Ramesh");
    
    e3.setEmpId(199);
    e3.setName("Suresh");
    
    Project p1= new Project();
    Project p2= new Project();
    Project p3= new Project();
    
    p1.setProjId(555);
    p1.setProjectName("Covid-19 Mask-Detection App");
    
    p2.setProjId(666);
    p2.setProjectName("Banking System Administration");
    
    p3.setProjId(777);
    p3.setProjectName("Railway Ticket Booking App");
    
    
    List<Emp> list1=new ArrayList<Emp>();
    List<Project> list2=new ArrayList<Project>();
    
    list1.add(e1);
    list1.add(e2);
    list1.add(e3);
    
    list2.add(p1);
    list2.add(p2);
    list2.add(p3);
    
    e1.setProjects(list2);
    p2.setEmps(list1);
    
    Session s=factory.openSession();
    Transaction tx=s.beginTransaction();
    
    s.save(e1);
    s.save(e2);
    s.save(e3);
    
    s.save(p1);
    s.save(p2);
    s.save(p3);
    
    System.out.println("\nTables created successfully....!!!");
    
    tx.commit(); 
    s.close();
    factory.close();
	    
   }   

}
