package com.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.pojo.Book;
import com.utils.HibernateUtils;

public class BookDAO {
//--------------------------------------------------------------------------------------------------	
	//CRUD:- 
	
	private static SessionFactory sf ;//only single static
//-------------------------------------------------------------------------------------------------		
	static {
		sf =HibernateUtils.getSessionFactory();
	}
//-------------------------------------------------------------------------------------------------		
	public BookDAO() {
		System.out.println("-------BookDAO constructor created------");
	}
//-------------------------------------------------------------------------------------------------		
	//getAllBooks:
	public static List<Book> getAllBooks(){
		System.out.println("\n-----inside getAllBooks----" );
		
		//User Query Object for executig HQL:- 
		//sql: select * from book; //book is table
		//hql:from Book bk; // Book is class and bk is object
		
		String hql = "from Book bk"; // not * used for excracte
		//Create Query:
		
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		
		Query query= session.createQuery(hql);
		//data is stored in query object
		//get data from query:
		
		List<Book> bookList = query.getResultList();
		//isEmpty:false    size: >0 
		
		session.getTransaction().commit();
		session.close();
		return bookList;
	
	}
//-------------------------------------------------------------------------------------------------		
	//getDeleteBooks:
	public static void deleteBook(Book newBook) {
		System.out.println("\n-----inside deleteBook----");
		//sql: update Book set name=? , author = ? , price=? where id=?;
		
		Session session = sf.getCurrentSession();
		session.beginTransaction();
			
		Book ObjToEdit = session.get(Book.class, newBook.getId());
		
		if(ObjToEdit!=null) {
			System.out.println("----Book ID is Present to update-----");
			session.delete(ObjToEdit);
//			session.update(ObjToEdit);
			System.out.println("Deleted BookID :" + ObjToEdit);
		}else {
			System.out.println("----No such Book ID Present to update----");
		}
				
		session.getTransaction().commit();
		session.close();
		System.out.println("------Updated Book-----");
	}
	
//-------------------------------------------------------------------------------------------------	
	
	//saveBook:
	public static void saveBook(Book newBook) {
		System.out.println("\n-----inside saveBook----" + newBook);
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		
		session.save(newBook);
		session.getTransaction().commit();
		session.close();
		System.out.println("\n New Book Added--------");	
		}
//-------------------------------------------------------------------------------------------------		
	//editBook
	public static void editBook(Book newBook) {
		System.out.println("\n-----inside editBook----");
		//sql: update Book set name=? , author = ? , price=? where id=?;
		
		Session session = sf.getCurrentSession();
		session.beginTransaction();
			
		Book ObjToEdit = session.get(Book.class, newBook.getId());
		
		if(ObjToEdit!=null) {
			System.out.println("----Book is Present to update-----");
			ObjToEdit.setName(newBook.getName());
			ObjToEdit.setAuthor(newBook.getAuthor());
			ObjToEdit.setPrice(newBook.getPrice());
			
			session.update(ObjToEdit);
			System.out.println("Updated Book:" + ObjToEdit);
		}else {
			System.out.println("----No such Book Present to update----");
		}
		session.getTransaction().commit();
		session.close();
		System.out.println("------Updated Book-----");
		
	}
//-------------------------------------------------------------------------------------------------		
	//getById:
	public static void getById(int bookId) {
		System.out.println("\n-----inside deleteBook----");
		//sql: update Book set name=? , author = ? , price=? where id=?;
		
		Session session = sf.getCurrentSession();
		session.beginTransaction();
			
		Book ObjToEdit = session.get(Book.class, bookId);
		
		if(ObjToEdit!=null) {
			System.out.println("----Book ID is Present to Search-----");
//			session.find(, ObjToEdit)
//			session.update(ObjToEdit);
			
			System.out.println("Searched BookID is :" + ObjToEdit);
		}else {
			System.out.println("----No such Book ID Present to Search----");
		}
				
		session.getTransaction().commit();
		session.close();
		System.out.println("------Updated Book-----");
	}
//----------------------------------------------------------------------------------------------------
	//getByAuthor:
	public List<Book> getBookByAuthor (String author){
		System.out.println("-----Inside getBookAuthor-----");
			Session session = sf.getCurrentSession();
			session.beginTransaction();
			
			String hql = "from Book bk where bk.author =?1";
			Query query = session.createQuery(hql);
			query.setParameter(1, author);
			
			List<Book> list  = query.getResultList();
			System.out.println("Size = " + list.size());
			 session.getTransaction().commit();
			    session.close();
			return list;
	}
//----------------------------------------------------------------------------------------------------	
	
	//getMaxPrice:
	
	public static List<Book> getBookPrice(double price) {
		System.out.println("----Inside getMaxPrice-----");
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		
		String hql = " from Book bk where bk.price =?1 "; 
		
		Query query = session.createQuery(hql);
		query.setParameter(1, price);
		
		List<Book> list  = query.getResultList();
		System.out.println("Size = " + list.size());
		 session.getTransaction().commit();
		    session.close();
		return list; 
		
	}
	
	//delete book by author:
	public static void deleteBookByAuthor(String author) {
		System.out.println("-----Inside getBookAuthor-----");
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		
		String hql = "from Book bk where bk.author =?1";
		Query query = session.createQuery(hql);
		query.setParameter(1, author);
		
		List<Book> list  = query.getResultList();
		
		for(Book b:list) {
			session.delete(b);
			System.out.println("Deleted......" + b);
		}
		
//		System.out.println("Size = " + list.size());
		 session.getTransaction().commit();
		    session.close();
	}
	
//	public 
}
