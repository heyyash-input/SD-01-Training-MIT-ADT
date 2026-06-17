package com.oneToone;

import javax.persistence.Query;

import org.hibernate.Session;

import com.util.HibUtil;

public class Test_HQL {
		public static void main (String [] args) {
			
			Session session = HibUtil.getSessionFactory().getCurrentSession();
			
			session.beginTransaction();
			
			String hql = "from Book b";
			
			//use query
			Query qry = session.createQuery(hql);
			List<Depart> list = qry.getResultList();
			
			for(Book bk : list) {
				System.out.println(bk);
			}
					
			session.ge
			
		}
}
