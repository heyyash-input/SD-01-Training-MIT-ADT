package Day02.DataTypesFundamentals;

import java.util.Scanner;

public class Mini_Shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-------Welcome to out Shop ------");
        System.out.println("1:Bag -> rs 350");
        System.out.println("2:Pen -> rs 20");
        System.out.println("3:book -> rs 15");
        System.out.println("4:Color Box -> 250");

        int ch ;
        double total = 0 ;
        System.out.println("Enter you choice");
        ch= sc.nextInt();
   do {
       System.out.println("You have Enter: " + ch);
       switch (ch) {
           case 1:
               total = 350;
               System.out.println("Bag cost is : " + total);
               break;
           case 2:
               total = 20;
               System.out.println("Pen cost is : " + total);
               break;
           case 3:
               total = 15;
               System.out.println("Book cost is : " + total);
               break;
           case 4:
               total = 250;
               System.out.println("Color box is : " + total);
               break;
           default:
               System.out.println("Invalid Input");
       }
       System.out.println("-----Thank you for shopping-----");
       break;
   }
    while(ch != 5);

    }
}
