package Day05.Revision;

public class ClassA {
//---------------------------------------------------------------------------------------------------------------

    public void parentFuncPub(){
        System.out.println("----Class A public methode-----");
    }

//---------------------------------------------------------------------------------------------------------------

    private void parentFuncPri(){
        System.out.println("----Class A private methode-----");
    }

//---------------------------------------------------------------------------------------------------------------

    protected void parentFuncPro(){
        System.out.println("----Class A protected methode-----");
    }

//---------------------------------------------------------------------------------------------------------------

    public void defaultFunc(){
        System.out.println("--------Child A default-------");
    }


    public void displayInfo(){
        System.out.println("----Display Info ---");
    }

//---------------------------------------------------------------------------------------------------------------
}
