package com.tester;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pojo.Manager;
import com.pojo.SalesPerson;
import com.pojo.Employee;

public class Tester_InheritanceMeth01 {
	
		public  static void main (String [] args) {
			//Configure config:
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
			
			
			Employee objEmp = new Employee(1 , "Raj" , 50000);
			session.save(objEmp);
			
			Manager objMgr = new Manager(2 , "Ram" , 70000 ,"IT") ;
			session.save(objMgr);
			
			SalesPerson objSalprn = new SalesPerson(3 , "Pranav" , 50000 , 8900);
			session.save(objSalprn);
			
			
			System.out.println("-----sf Created-----");
			
			trans.commit();
			session.close();

		}
}
