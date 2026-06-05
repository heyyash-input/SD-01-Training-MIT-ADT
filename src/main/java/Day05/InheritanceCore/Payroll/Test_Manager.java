package Day05.InheritanceCore.Payroll;

public class Test_Manager {
    public static void main(String[] args) {
//---------------------------------------------------------------------------------------------------------------
        Manager m1 =new Manager();
        m1.assignTask();
//---------------------------------------------------------------------------------------------------------------

        System.out.println("------------------------------------");
        Manager mgr1 = new Manager(103 ,"Yash" ,890000 , 760000);
        mgr1.assignTask();
//        mgr1.displayInfo();
        mgr1.incPrint(); //  in Manager function add super.display (of child class) to print everyhting
        System.out.println("-------------END------------");

//---------------------------------------------------------------------------------------------------------------


//---------------------------------------------------------------------------------------------------------------
    }
}
