package Day01.VariableDemo;

import java.util.Scanner;

public class Demo3 {

// Age verification for Licencse:-
//    accpet birth year
//    calc age
//    then display valid or not

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age ");
        int age ;
        age = sc.nextInt();
        if(age<18){
            System.out.println("Not valid");
        }  else{
            System.out.println("Valid");
        }
        System.out.println("---------------End-------------");
    }
}
