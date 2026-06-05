package Day05.InheritanceCore.CarAssignment.Tester;

import Day05.InheritanceCore.CarAssignment.BMW;
import Day05.InheritanceCore.CarAssignment.Car;
import Day05.InheritanceCore.CarAssignment.Ferrari;
import Day05.InheritanceCore.CarAssignment.Nano;

public class Test_DownCasting {

    public static void main(String[] args) {
//------------------------------------------------------------------------------------------------------------------

        Car obj = new BMW(); //Up casting occures: implicitly
        obj.speed();
//        obj.abs();
        //ERROR: The method abs()
        // is undefined for the type Car

//------------------------------------------------------------------------------------------------------------------

//        //how to solve compile time error
//        BMW b = (BMW) obj ; //Down Casting: Explicit casting
//        b.abs();

        obj = new Ferrari();
//        BMW b = (BMW) obj ; //Down Casting: Explicit casting
//        b.abs();

//------------------------------------------------------------------------------------------------------------------

        //Error: ClassCastException
        //to avoid the ClassCastException use RTTI
        //RTTI : run time type Identification
        // how to use RTTI
        // use instance opertator

        if(obj instanceof Ferrari){
            Ferrari f = (Ferrari) obj;
            f.nos();
            System.out.println("---DWN casted to ferrari----");
        }
        else if (obj instanceof Nano){
            Nano n  = (Nano) obj ;
            n.speed();
            System.out.println("---DWN casted to BMW----");
        }
        else if (obj instanceof BMW){
            BMW b = (BMW) obj ;
            b.abs();
            System.out.println("---DWN casted to BMW----");
        }

//------------------------------------------------------------------------------------------------------------------
    }
}
