package Day04.Constructor.SyntaxAndCalling.Shopping;

import java.util.Scanner;

public class Test_Customer {
    public static void main(String[] args) {
//---------------------------------------------------------------------------------------------------------------
        Scanner sc = new Scanner(System.in);
//---------------------------------------------------------------------------------------------------------------

        System.out.println("Enter Customer details id , name , email , city , phno.");
//        int id = sc.nextInt();
//        String name = sc.next();
//        String email = sc.next();
//        String city  =sc.next();
//        int contact = sc.nextInt();
//        Customer cust1 = new Customer(id,name,email,city,contact);

//---------------------------------------------------------------------------------------------------------------

        Customer cust1 = new Customer(sc.nextInt() , sc.next(), sc.next(), sc.next(), sc.nextInt());
        cust1.displayInfo();
//        cust1.getname();

//---------------------------------------------------------------------------------------------------------------
    }
}
