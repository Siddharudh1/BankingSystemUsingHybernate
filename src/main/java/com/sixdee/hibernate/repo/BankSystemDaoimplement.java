package com.sixdee.hibernate.repo;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sixdee.hibernate.entity.Account;
import com.sixdee.hibernate.util.SessionFactoryUtil;

@Repository
@Transactional
public class BankSystemDaoimplement implements BankSystemDAO{
	@Override
	public Account createcustomerDetails(Account acc) {
		 SessionFactory sessionFactoy = SessionFactoryUtil.getSessionFactoy();
    	 Session openSession =  sessionFactoy.openSession();
    	 
    	Transaction beginTransaction = openSession.beginTransaction();
    	 
    	 openSession.save(acc); 
    	 beginTransaction.commit();
    	 openSession.close();
    	 return acc;
    	 
	}

}