package Day05.Revision;

public class Test_Inheritance {
    public static void main(String[] args) {
//---------------------------------------------------------------------------------------------------------------

        ClassA objA = new ClassA();
        objA.parentFuncPub();
        objA.parentFuncPro();
        objA.defaultFunc();

//---------------------------------------------------------------------------------------------------------------
        System.out.println("\n\n");
//---------------------------------------------------------------------------------------------------------------

        ClassB objB = new ClassB();
        objB.chilBFuncPu();
        objB.defaultFunc();
        objB.parentFuncPro();
        objB.displayInfo();

//---------------------------------------------------------------------------------------------------------------
    }
}
