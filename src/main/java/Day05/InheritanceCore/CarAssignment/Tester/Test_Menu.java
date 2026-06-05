package Day05.InheritanceCore.CarAssignment.Tester;

import Day03.OOPS_Fundamentals.AccessModifiers.BankSystem.Bank;
import Day05.InheritanceCore.CarAssignment.BMW;
import Day05.InheritanceCore.CarAssignment.Car;
import Day05.InheritanceCore.CarAssignment.Ferrari;
import Day05.InheritanceCore.CarAssignment.Nano;

import java.util.Scanner;

public class Test_Menu {

    public static void main(String[] args) {

        System.out.println("1:Ferrari");
        System.out.println("2:BMW");
        System.out.println("3:Nano");
        System.out.println("4:Start Race");

        int ch ;
        int index =0 ;
        Scanner sc =  new Scanner(System.in);
        Car[] myCars = new Car[3];// null null null

        do {
            System.out.println("Enter choice");
            ch= sc.nextInt();
            switch (ch){
                case 1 :

                    Ferrari fObj = new Ferrari();
                    myCars[index] = fObj; //Up Casting
                    index++;
                    System.out.println("---Ferrari added---");
                    break;

                case 2 :

                    Nano nObj = new Nano();
                    myCars[index] = nObj;
                    index++;
                    System.out.println("---Ferrari added---");
                    break;

                case 3 :

                    BMW bObj = new BMW();
                    myCars[index] = bObj;
                    index++;
                    System.out.println("---Ferrari added---");
                    break;

                case 4:

                    System.out.println("----Start Racing---");
                    for (int i = 0; i < myCars.length; i++) {
                        if(myCars[i] != null){
                            myCars[i].speed();
                        }
                    }
                    break;

                default:
                    System.out.println("-------Enter valid choice!-----");
            }
        }while(ch!=4);
        System.out.println("-------END-------");
    }
}
