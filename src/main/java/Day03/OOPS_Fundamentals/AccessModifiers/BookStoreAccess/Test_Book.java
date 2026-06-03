package Day03.OOPS_Fundamentals.AccessModifiers.BookStoreAccess;

import java.util.Scanner;

public class Test_Book {
    public static void main(String[] args) {

//----------------------------------------------------------------------------------------------------------------
        Scanner sc = new Scanner(System.in);
//----------------------------------------------------------------------------------------------------------------

        Book book = new Book();
        book.assign(108,"Alchemist","Yash Patil" , 800);
        book.displayInfo();

//----------------------------------------------------------------------------------------------------------------

        Book book1 = new Book();
        book.assign(801 ,"The secret" , "Mona" , 900);
        book.displayInfo();

//----------------------------------------------------------------------------------------------------------------



    }
}
