package Day02.DataTypesFundamentals;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int no1 , no2 , no3 ;
        // Data types
        // primitive ----- value types
        // non-primitive -----refernce type

        System.out.println("Enter numbers ");
        no1 = sc.nextInt();
        no2 = sc.nextInt();

        System.out.println(no1);
        System.out.println(no2);

        System.out.println("----greater check ------");
        greaterThan(sc,no1,no2);

        System.out.println("-----------even check ----------");
        isEven(sc,no1);

    }

    public static void greaterThan (Scanner sc , int no1 , int no2){
        if ( no1 < no2){
            System.out.println("no1 < no2 ");
        }else{
            System.out.println("no1 > no2 ");
        }
    }

    public static void isEven(Scanner sc , int no1){
        if(no1 % 2 == 0 && no1 >= 50){
            System.out.println("number is even");
            System.out.println(no1);
        }else{
            System.out.println("number is odd ");
            System.out.println(no1);
        }
    }
}
