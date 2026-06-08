package Day07.Generics;

public class Test_WrapperClasses {
    public static void main(String[] args) {
//----------------------------------------------------------------------------------------------------------------
        int a =10 ;

        //use Integer wrapper class
        Integer intObj =a ; // AutoBoxing
        //ref type = primitive type:
//----------------------------------------------------------------------------------------------------------------
        System.out.println(intObj);

        int b = intObj ; // AutoUnboxing
        // primitive type  = reference type

        //can i use int value for swap :- NO
//----------------------------------------------------------------------------------------------------------------
        MyClass<Integer> swapObj = new MyClass<Integer>();
        swapObj.swap(a,20);
//----------------------------------------------------------------------------------------------------------------
        MyClass<Double> swapDobl = new MyClass<Double>();
//        swapObj.swap(12.45 ,78.89);
//----------------------------------------------------------------------------------------------------------------

    }
}
