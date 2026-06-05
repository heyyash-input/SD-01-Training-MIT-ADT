package Day04.Inheritance;

public class Test_Inheritance {
    public static void main(String[] args) {
//---------------------------------------------------------------------------------------------------------------

        ChildClass ch = new ChildClass();
        ch.childCFunc();

//---------------------------------------------------------------------------------------------------------------

        ChildClass ch1 = new ChildClass();
        ch1.childCFunc();
        ch1.parentFunc(); // After Extending Parent class I can access to this function
        ch1.parentFunc1(); // I can access protected methods


//---------------------------------------------------------------------------------------------------------------

        // not able to access child properties via parent objects
        ParentClass ph1 = new ChildClass();
        ph1.parentFunc();
        
//---------------------------------------------------------------------------------------------------------------
    }
}
