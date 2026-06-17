package com.tester;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pojo.Book;

public class Test_Hibernate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Configuration config = new Configuration().configure();
		
		//hibernate.cfg.xml will get loaded
		System.out.println("-----config file get loaded-----");
		
		SessionFactory sf = config.buildSessionFactory();
		System.out.println("-----sf Created-----");
		
		//create session using sf
		Session session = sf.getCurrentSession();
		
		//create DML using session
		//strt Transaction
		Transaction trans = session.beginTransaction();
		
		Book bk = new Book (2, "Secret" , " james" , 10000);
		session.save(bk);
		System.out.println("-----sf Created-----");
		
		trans.commit();
		session.close();
		
	}

}
