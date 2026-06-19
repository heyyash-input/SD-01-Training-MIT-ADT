package com.tester;

import java.util.List;
import java.util.Scanner;

import com.dao.BookDAO;
import com.pojo.Book;

public class Tester_CRUD {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("-------Hibernate CRUD Project------");
		System.out.println("1: Show All Books");
		System.out.println("2: Add new Book");
		System.out.println("3:	Edit		");
		System.out.println("4: Remove Book ");
		System.out.println("5: Get Book by ID: ");
		System.out.println("6: Get Author  ");
		System.out.println("7: Get Price ");
		System.out.println("8: Delete book by author ");
		
		
		//Call only DAO for methods 
		BookDAO bookDao = new BookDAO(); 
		
		
		int ch; 
		
		do {
			
			System.out.println("Enter Choice: ");
			ch = sc.nextInt();
			
			switch(ch) {
			case 1:
				System.out.println("------Get all book----");
				for(Book bk : bookDao.getAllBooks()) {
					System.out.println(bk);
				}
				//bookDao.getAllBooks().forEach(bk); Lamda Func
				break;
			case 2:
				System.out.println("BookId || Name || Author || Price");
				Book bk = new Book(sc.nextInt() , sc.next() , sc.next() , sc.nextDouble());
				bookDao.saveBook(bk);
				break;
			case 3:
				System.out.println("------Enter BookID to edit----");
				int id = sc.nextInt();
				System.out.println("------Enter:- author || name || price || to edit----");
				String  aut = sc.next();
				String nm = sc.next();
				double price = sc.nextDouble();
				bookDao.editBook(new Book(id , aut , nm , price));  
				break;
			case 4:
				 System.out.println("------Enter BookID to delete----");
				    int id2 = sc.nextInt();
				    Book bk2 = new Book();
				    bk2.setId(id2);
				    bookDao.deleteBook(bk2);
				    break;
			case 5:
				System.out.println("------Enter BookID to Search----");
				id = sc.nextInt();
				bookDao.getById(id);
				break;
			case 6:
				System.out.println("---Enter Author name: ----");
				List<Book> bks = bookDao.getBookByAuthor(sc.next());
				for(Book b: bks) {
					System.out.println(b);
				}
				break;
			case 7:
				System.out.println("--showing greater price----");
				
				List<Book> bkPrice = bookDao.getBookPrice(sc.nextDouble());
				for(Book b: bkPrice) {
					System.out.println(b);
				}
				break;
			case 8:
				System.out.println("----Enter Author name--");
				bookDao.deleteBookByAuthor(sc.next());
				break;
				default:System.out.println("---Enter valid Choice!---");
			}	
		}while(ch!=10);
			System.out.println("--------END-------");
	}

}
