package com.sixdee.hibernateDemoProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       //Storing the data in the database....
      /* Customer c = new Customer();
       c.setCustomerid(102);
       c.setFirstname("Sachin");
       c.setUsername("Sachi");
       c.setLastname("methre");
       c.setAge(22);
       c.setAddress("Bidar");
       c.setMobileNumber("7022104694");
       c.setDateOfBirth("01/06/1999");
       c.setBalance(2000);
       
       Configuration con = new Configuration().configure().addAnnotatedClass(Customer.class);
       ServiceRegistry reg= new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
       SessionFactory sf =con.buildSessionFactory(reg);
       Session session = sf.openSession();
       Transaction tx = session.beginTransaction();
       session.save(c);
       tx.commit();*/
    	
    	//Feteching the data in the console.......
    	
    	Customer c = null;
    	Configuration con = new Configuration().configure().addAnnotatedClass(Customer.class);
        ServiceRegistry reg= new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf =con.buildSessionFactory(reg);
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        //c =(Customer) session.get(Customer.class, 101);
        c =(Customer) session.get(Customer.class, 102);
        tx.commit();
        System.out.println(c);
    }
}
