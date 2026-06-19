package com.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
//-------------------------------------------------------------------------------------------------	
private static SessionFactory sf ;
//---------------------------------------------------------------------------------------------------	
	public static SessionFactory getSessionFactory() {
		// Configure fetch from Congif file: 
		Configuration config = new Configuration().configure();
		
		//hibernate.cfg.xml will get loaded
		System.out.println("-----config file get loaded-----");
		
			sf = config.buildSessionFactory();
		System.out.println("-----sf Created-----");
		
		return sf ; // return session 
	}
//---------------------------------------------------------------------------------------------------	
}
