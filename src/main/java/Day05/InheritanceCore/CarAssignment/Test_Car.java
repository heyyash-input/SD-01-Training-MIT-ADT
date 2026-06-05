package Day05.InheritanceCore.CarAssignment;

import java.util.Scanner;

public class Test_Car {
    public static void main(String[] args) {
//----------------------------------------------------------------------------------------------------------------

        Scanner sc = new Scanner(System.in);

//---------------------------------------------------------------------------------------------------------------
        Car car = new Car(11,"Ferrari",5600);
        car.display();
//---------------------------------------------------------------------------------------------------------------
        Nano nano = new Nano();
        nano.speed();
//---------------------------------------------------------------------------------------------------------------
        Ferrari f = new Ferrari();
        f.speed();
//---------------------------------------------------------------------------------------------------------------
//        BMW bmw = new BMW(19,"BMW M3" , 89000 ,"Airbags");
//        bmw.speed();
//        bmw.display();
//        bmw.displayBmw();
//---------------------------------------------------------------------------------------------------------------

        System.out.println("1:Show BMW Details");
        System.out.println("2:Cars Details");
        System.out.println("3:Modify Cars Details");
        System.out.println("4:Exit Menu");

        int ch ;

        do {
            System.out.println("Enter Choice");
            ch=sc.nextInt();

            switch (ch){
                case 1:

                    break;
                case 2:break;
                case 3:break;
                case 4:break;
                default:
                    System.out.println("Enter Valid Choices");
            }

        }while(ch!=5);
    }
}
