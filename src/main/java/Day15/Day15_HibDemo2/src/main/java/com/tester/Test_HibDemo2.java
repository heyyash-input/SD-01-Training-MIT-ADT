package com.tester;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pojo.Depart;

public class Test_HibDemo2 {

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
		
	
		Depart dp = new Depart ();
		ArrayList<Depart> listDp = new ArrayList<Depart> () ;
		dp = listDp.add() ;
		
		for(int i = 0 ; i <= listDp.size() ; i++) {
			i++;
		}
		
		System.out.println("-----sf Created-----");
		
		trans.commit();
		session.close();
		
	}

}
