package Day04.Constructor.SyntaxAndCalling.Shopping;

public class Customer {
//---------------------------------------------------------------------------------------------------------------

    private int custId ;
    private String name , email , city ;
    private int contactNo ;

//---------------------------------------------------------------------------------------------------------------

    public Customer(int custId, String name, String email, String city, int contactNo) {
        this.custId = custId;
        this.name = name;
        this.email = email;
        this.city = city;
        this.contactNo = contactNo;
    }

//---------------------------------------------------------------------------------------------------------------

    public void displayInfo(){
        System.out.println("---------------Details-------------");
        System.out.println("Customer ID:" + custId);
        System.out.println("Custome name: " + name);
        System.out.println("Customer email: " + email);
        System.out.println("Customer city: " + city);
        System.out.println("Customer Contact no: " + contactNo);
        System.out.println("---------------END-------------");
    }

//---------------------------------------------------------------------------------------------------------------

}
