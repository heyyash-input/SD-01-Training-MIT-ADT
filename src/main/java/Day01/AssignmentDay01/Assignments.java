package Day01.AssignmentDay01;

import java.util.Scanner;

public class Assignments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Calculator:-
        Calculator(sc,56,78);
        // Elgibility Citizenship for voting:-
        LogicalOperator(sc);
    }

    public static void Calculator(Scanner sc , int num1 , int num2 ){
        System.out.println("Enter first number");
        num1=sc.nextInt();
        System.out.println("Enter second number");
        num2=sc.nextInt();
        int mult = num1 * num2;
        int add = num1 + num2;
        int subs = num1 - num2;
        System.out.println("Multiplication:-" + mult);
        System.out.println("Substraction:-" + add);
        System.out.println("substraction:-" + subs);
    }

    public static void LogicalOperator(Scanner sc ){
        System.out.println("Logical Operator");

        int age ;
        boolean status;
        char ch ;

        System.out.println("Enter age:-");
        age = sc.nextInt();
        System.out.println("Enter status of citizenship");
        status = sc.nextBoolean();
        System.out.println("Enter  y/n");
        ch = sc.next().charAt(0);
        if (age >= 18 && ch == 'y'){
            System.out.println("Eligible for voting ");
        }
        else if (age >=18) {
            System.out.println("Eligible for voting ");
        }
        else{
            System.out.println("Not valid ");
        }
    }
}
