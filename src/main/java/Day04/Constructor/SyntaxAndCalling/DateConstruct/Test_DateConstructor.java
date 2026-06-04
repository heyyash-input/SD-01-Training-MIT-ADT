package Day04.Constructor.SyntaxAndCalling.DateConstruct;

import java.util.Scanner;

public class Test_DateConstructor {
    public static void main(String[] args) {

//-----------------------------------------------------------------------------------------------------------------

        Scanner sc = new Scanner(System.in);
//-----------------------------------------------------------------------------------------------------------------

        // constructor called with new keyword
        int d = 10 , m = 7 , y = 2004 ;
        Date dob1 = new Date(d , m , y); // called the values
        dob1.print();
        System.out.println("------END-----");

//-----------------------------------------------------------------------------------------------------------------

        System.out.println("Enter Date / month / year");
        int d1 = sc.nextInt();
        int m1 = sc.nextInt();
        int y1 = sc.nextInt();
        Date dob2 = new Date(d1,m1,y1);
        dob2.print();
        System.out.println("---End---");

//-----------------------------------------------------------------------------------------------------------------



    }
}
