package com.sixdee.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.sixdee.hibernate.entity.Account;

public class SessionFactoryUtil {
	private static SessionFactory factory = null;
	
	public static  SessionFactory getSessionFactoy() {
		if(factory == null) {
			factory = new Configuration().configure().buildSessionFactory();		
		}
		return factory;
	}
	
}
