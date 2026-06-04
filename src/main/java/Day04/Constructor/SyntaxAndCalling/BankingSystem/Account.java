package Day04.Constructor.SyntaxAndCalling.BankingSystem;

public class Account {
//---------------------------------------------------------------------------------------------------------------
    private int actId ;
    private String name ;
    private double balance ;

//---------------------------------------------------------------------------------------------------------------

    public Account(){
        System.out.println("Account Constructor is called");
        actId = 12 ;
        name = "Ram" ;
        balance = 120000;
    }

//---------------------------------------------------------------------------------------------------------------

    public void displayInfo(){
        System.out.println("Account Details: " + actId +" " + name +" " + balance);
    }

//---------------------------------------------------------------------------------------------------------------

    public Account(int actId , String name , double balance){
        System.out.println("----Account Parameter----");

        //==================================================

        /// This has formed conflict
//        actId = actId;
//        name = name ;
//        balance = balance ;

        //===================================================

        /// above can be removed by 'this' keyword
        // now data member is in right side and local variable is in left side
        this.actId = actId ;
        this.name = name;
        this.balance = balance;
    }

//---------------------------------------------------------------------------------------------------------------
}
