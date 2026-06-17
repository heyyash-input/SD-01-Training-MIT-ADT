package com.pojo;

import org.hibernate.Session;

import com.util.HibUtil;

public class Tester_Component {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibUtil.getSessionFactory().getCurrentSession();
		
		Depart dp1 = new Depart(1 ,"Raj" , 8900);
		
		Employee emp  = new Employee(1 , "8999");
		
		
		
	}

}
