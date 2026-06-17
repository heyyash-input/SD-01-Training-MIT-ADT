package com.util;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.pojo.Depart;

public class Test_HibUtil {
	
		
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Session session = HibUtil.getSessionFactory().openSession();
		
		Transaction trans = session.beginTransaction();
			System.out.println("Enter id  emp_name  salary ");
			
			Depart d1 = new Depart(sc.nextInt() , sc.next() , sc.nextDouble());
			
			session.save(d1);
			
			trans.commit();
			session.close();
			
	}
}
