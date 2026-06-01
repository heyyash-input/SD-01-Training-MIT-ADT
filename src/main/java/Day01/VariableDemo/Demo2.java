package Day01.VariableDemo;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Student details");

        int rollno ;
        String name ;
        int age ;
        boolean result ;
        double per ;
        char ch ;
        boolean status ;

        System.out.println("Enter roll number:- ");
        rollno = sc.nextInt();
        System.out.println("Enter your name ");
        name = sc.next();
        System.out.println("Enter age :- ");
        age = sc.nextInt();
        System.out.println("Enter your percentage");
        per = sc.nextDouble();
        System.out.println("Enter student details ");
        status = sc.nextBoolean();
        System.out.println("Enter y/n to continue");
        ch = sc.next().charAt(0);

        System.out.println("-----------------Details-----------------");
        System.out.println(rollno);
        System.out.println(name);
        System.out.println(age+" "+status+" "+ per + " " +ch );
    }
}
