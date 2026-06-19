package com.oneToone;

import org.hibernate.Session;

import com.util.HibUtil;

public class Tester_OneToOne {
		
	public static void main(String[] args) {

		Session session = HibUtil.getSessionFactory().getCurrentSession();
		
		session.beginTransaction();

		// to store employee
		com.oneToone.MyEmployee emp1 = new com.oneToone.MyEmployee(102,"Anil", 90000);

		com.oneToone.EmployeeDetails empDetails1 = new com.oneToone.EmployeeDetails(11, "Maha", "xyz@gmail.com" , "maha@gmial.com");

		empDetails1.setEmpid(69);

		session.save(emp1);
		
		session.save(empDetails1);

		System.out.println("---inserted------");

		session.getTransaction().commit();
		session.close();

	}
}	
