package Day01.VariableDemo;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter month number");

        int month ;
        month = sc.nextInt();

        if(month == 1 ){
            System.out.println("------------Jan----------");
        }
        else if(month == 2){
            System.out.println("------------Feb---------");
        }
        else if(month == 3){
            System.out.println("------------Mar----------");
        }
        else if(month == 4){
            System.out.println("------------Apr---------");
        }
        else if(month == 5){
            System.out.println("------------May----------");
        }
        else{
            System.out.println("please Enter valid month ");
        }
        System.out.println();
    }
}
