package Day05.InheritanceCore.Payroll;

public class Manager extends Employee {
//-------------------------------------------------------------------------------------------------------------
    private double incen ;
//---------------------------------------------------------------------------------------------------------------

    public void assignTask(){
        System.out.println("-----Manager assign task-----");
    }
//---------------------------------------------------------------------------------------------------------------

    public Manager(){
        super();
        incen = 8900;
        System.out.println("----Default Constructor of Manager-----");
    }

//---------------------------------------------------------------------------------------------------------------

    public Manager(int id , String name , double salary , double incen){
//        super() -> if called this employee constructor will be called
        super(id,name , salary); // Explicitly pass parameter
        System.out.println("----Default Constructor of Manager-----");
        this.incen = incen; // for printing incent of manager
    }

//---------------------------------------------------------------------------------------------------------------

    //Overriding
    // same function name and same signature
    //possible only in inheritance
    public void incPrint(){
        super.displayInfo();// using this we can easily call whle child function with parent
        System.out.println("Incentive: " + incen);
    }

//---------------------------------------------------------------------------------------------------------------

}
