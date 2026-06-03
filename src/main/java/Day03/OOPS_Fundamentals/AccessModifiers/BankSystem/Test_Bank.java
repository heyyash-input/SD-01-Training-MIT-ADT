package Day03.OOPS_Fundamentals.AccessModifiers.BankSystem;

import java.util.Scanner;

public class Test_Bank {
    public static void main(String[] args) {

//-----------------------------------------------------------------------------------------------------------------

        Scanner sc =  new Scanner(System.in);

//----------------------------------------------------------------------------------------------------------------

        System.out.println("Enter actId , name ,Email , balance ");
        int id = sc.nextInt();
        String name = sc.next();
        String email = sc.next();
        double balance = sc.nextDouble();

//----------------------------------------------------------------------------------------------------------------

        Bank acc1 = new Bank();
        acc1.creatAcc(id,name,email,balance);
        acc1.displayInfo();

//------------------------------------------------------------------------------------------------------------------

        System.out.println("----Enter AmountTo Withdraw");
        double amount = sc.nextDouble();
        acc1.withdraw(amount);
        double cbal = acc1.getBal();
        System.out.println(cbal);

//------------------------------------------------------------------------------------------------------------------

        Bank acc2 = new Bank();
        acc2.creatAcc(id,name,email,balance);
        acc2.displayInfo();
        acc2.withdraw(amount);
        acc2.getBal();

//-----------------------------------------------------------------------------------------------------------------

    }
}
