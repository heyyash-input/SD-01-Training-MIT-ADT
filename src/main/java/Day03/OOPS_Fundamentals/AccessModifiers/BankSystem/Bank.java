package Day03.OOPS_Fundamentals.AccessModifiers.BankSystem;

public class Bank {

// --------------------------------------------------------------------------------------------------------------

    private int actId;
    private String name , email ;
    private double balance ;

//------------------------------------------------------------------------------------------------------------------

    public void creatAcc(int id , String nm , String em , double bal){
        actId = id ;
        name = nm ;
        email = em ;
        balance = bal;
    }

//------------------------------------------------------------------------------------------------------------------

    public void displayInfo(){
        System.out.println("Account Info:" + actId + " " + name + " " + email + " $" + balance);
    }

    public void withdraw(double amount){
        System.out.println("----inside Withdraw--");
        if(amount < 0){
            System.out.println("Enter Valid amount");
        }
        else{
            balance = balance - amount ;
            System.out.println("balance updated:" + balance);
        }
    }

//------------------------------------------------------------------------------------------------------------------

    public void deposit(double amount){
        System.out.println("----inside Deposite--");
        if(amount < 0 ){
            System.out.println("Enter Valid amount");
        }
        else{
            balance = balance + amount ;
            System.out.println("balance updated:" + balance);
        }
    }

//------------------------------------------------------------------------------------------------------------------

    public double getBal() {
        return balance ;
    }

//------------------------------------------------------------------------------------------------------------------

}
