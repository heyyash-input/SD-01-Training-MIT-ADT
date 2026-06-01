package Day01;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//      While and for loop diff ?
//        ans -> while loop is considered when we dont know how much to iterate,
                // for loop we need

        System.out.println("---------------while------------");

        int i = 1 ;
        while(i <= 10){
            System.out.println(i);
            i++;
        }

        System.out.println("----------------for------------");

        for (int j = 0; j <= 10 ; j++) {
            System.out.println(j);
        }

        System.out.println("------------First 10 even numbers---------");

        for (int num = 0; num < 10; num++) {
            if(num%2==0){
                System.out.println(num);
            }
        }

        System.out.println("-----------addition using while loop----------");

        int no = 0;
        int sum =0 ;
        while(no >= 0){
            System.out.println("Enter number");
            no = sc.nextInt();
            sum += no;
            System.out.println("sum is:-" + sum);
        }

    }
}
