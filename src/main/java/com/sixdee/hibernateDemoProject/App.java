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
       Customer c = new Customer();
       c.setCid(100);
       c.setCname("SIDDU");
       c.setAddress("BIDAR");
       
       Configuration con = new Configuration().configure().addAnnotatedClass(Customer.class);
       SessionFactory sf =con.buildSessionFactory();
       Session session = sf.openSession();
       Transaction tx = session.beginTransaction();
       session.save(c);
       tx.commit();
    }
}
