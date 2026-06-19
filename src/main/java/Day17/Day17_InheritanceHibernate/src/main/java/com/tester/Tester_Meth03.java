package com.tester;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pojo.Employee1;
import com.pojo.Manager1;
import com.pojo.SalesPerson1;

public class Tester_Meth03 {

	public static void main(String[] args) {
		
		Configuration config = new Configuration().configure();
		//hibernate.cfg.xml will get loaded:
		System.out.println("-----config file get loaded-----");
		
		SessionFactory sf = config.buildSessionFactory();
		System.out.println("-----sf Created-----");
		
		//create session using sf:
		Session session = sf.getCurrentSession();
		
		//create DML using session:
		//start Transaction:
		Transaction trans = session.beginTransaction();
		
		
		Employee1 objEmp = new Employee1(1 , "Raj" , 50000);
		session.save(objEmp);
		
		Manager1 objMgr = new Manager1(2,"raghav" ,89.89 , "IT");
		session.save(objMgr);
		
		SalesPerson1 objSalprn = new SalesPerson1(3 , "Pranav" , 50000 , 8900);
		session.save(objSalprn);
		
		
		System.out.println("-----sf Created-----");
		
		trans.commit();
		session.close();

	}

}
