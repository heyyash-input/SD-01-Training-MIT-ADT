package Day04.Constructor.SyntaxAndCalling.BankingSystem;

import java.util.Scanner;

public class Test_Account {
    public static void main(String[] args) {
//---------------------------------------------------------------------------------------------------------------

        Scanner sc = new Scanner(System.in);

//---------------------------------------------------------------------------------------------------------------

        //Default Constructor:-
        System.out.println("---act1 details---");
        Account act1 = new Account();
        act1.displayInfo();

//---------------------------------------------------------------------------------------------------------------

        //Parameter Constructor:-
        System.out.println("---act2 details---");
        int id = 101 ;
        String nm = "Sham" ;
        double bal = 89000;
        Account act2 = new Account(id , nm , bal);
        act2.displayInfo();

//---------------------------------------------------------------------------------------------------------------

        //Input user:-
        System.out.println("---act3 details---");
        System.out.println("---Enter Account Details---");
        int id1  = sc.nextInt();
        String nm1 = sc.next();
        double bal1 = sc.nextInt();
        Account act3 = new Account(id1,nm1,bal1);
        act3.displayInfo();

//---------------------------------------------------------------------------------------------------------------
    }
}
