package Day05.InheritanceCore.CarAssignment.Tester;

import Day05.InheritanceCore.CarAssignment.BMW;
import Day05.InheritanceCore.CarAssignment.Car;
import Day05.InheritanceCore.CarAssignment.Ferrari;
import Day05.InheritanceCore.CarAssignment.Nano;

public class TestRacing {
    public static void main(String[] args) {
//----------------------------------------------------------------------------------------------------------------

        //Override Methods
        //ParentObjects ----> ParentClassMethod
        Car car = new Car();
        car.speed();

        System.out.println();
        BMW b = new BMW();
        //ChildObject ----> Chil
        b.speed();

        Car cObj;
        cObj = new Ferrari();

//----------------------------------------------------------------------------------------------------------------

        //base class Object can hold ref of Derived Class
        Car baseObj = new BMW () ; //Upcasting
//        baseObj // Compiler : Car class
//        baseObj // Runtime : BMW class
        baseObj.speed(); // Car Class

//---------------------------------------------------------------------------------------------------------------

        baseObj = new Ferrari(); // Up Casting
        baseObj.speed();

        baseObj = new Nano(); // Up Casting
        baseObj.speed();

     }
}
