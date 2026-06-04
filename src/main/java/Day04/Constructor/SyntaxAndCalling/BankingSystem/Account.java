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

    public Account(int id , String nm , double bal){
        System.out.println("----Account Parameter----");
        actId = id ;
        name = nm ;
        balance = bal ;
    }

//---------------------------------------------------------------------------------------------------------------
}
