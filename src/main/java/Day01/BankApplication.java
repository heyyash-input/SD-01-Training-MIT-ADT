package Day01;

import java.util.Scanner;

public class BankApplication {
//    Mini Banking System:-

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1: Create Account");
        System.out.println("2: Show Details");
        System.out.println("3: Edit Details");
        System.out.println("4: Withdraw");
        System.out.println("5: Deposite");
        System.out.println("6: Check balance");
        System.out.println("7: Delete Account");
        System.out.println("8: Exit");

        int ch ;
        int day , month , year ;
        String name = "", city = "", email = "";
        double amount , balance = 0 ;
        long contactNumber =0;

        do {
            System.out.println("Enter you options");
            ch = sc.nextInt();

            switch(ch){

                case 1 :
                    System.out.println("Enter name ");
                    name = sc.next();
                    System.out.println("Enter email");
                    email = sc.next();
                    System.out.println("Enter city");
                    city = sc.next();
                    System.out.println("Enter Contact number");
                    contactNumber = sc.nextLong() ;
                    System.out.println("Enter balance");
                    balance = sc.nextDouble();
                    System.out.println("Enter day ");
                    day = sc.nextInt();
                    System.out.println("Enter month ");
                    month=sc.nextInt();
                    System.out.println("Enter year");
                    year=sc.nextInt();
                    System.out.println("--------------Account Created successfully---------");
                    break;

                case 2 :
                    if (balance == 0){
                    System.out.println("User has not Create Account ");
                }
                    else{
                        System.out.println(balance+" " +name+" "+email+" "+contactNumber+" "+city);
                }
                    break ;

                case 3:
                    System.out.println("Enter values to be updated");
                    System.out.println("Enter name ");
                    name = sc.next();
                    System.out.println("Enter email");
                    email = sc.next();
                    System.out.println("Enter city");
                    city = sc.next();
                    System.out.println("Updated values:- "+ name +" "+email+" "+city);
                    break ;

                case 4 :
                    System.out.println("Enter amount to withdraw");
                    amount = sc.nextInt();
                    if(amount > 0 && amount < balance){
                        balance -= amount ;
                        System.out.println("Balance updated"+ balance);
                    }else{
                        System.out.println("Enter valid amount");
                    }
                    break ;

                case 5 :
                    System.out.println("Enter amount to Deposite");
                    amount = sc.nextInt();
                    if(amount > 0 ){
                        balance += amount ;
                        System.out.println("Balance updated:- "+ balance);
                    }else{
                        System.out.println("Enter valid amount");
                    }
                    break ;

                case 6 :
                    System.out.println("Your available balance:- "+ balance);
                    break ;

                case 7 : break ;
                case 8 : break ;
            }

        }
        while(ch != 8);


        System.out.println("----------Thank you for Mira Bank Application-------------");
    }
}
