package Day04.Constructor.SyntaxAndCalling.DateConstruct;

public class Date {
//-----------------------------------------------------------------------------------------------------------------

    //Data Members : instance variable
    // private : accessible inside calss only
    private int day , month , year ;

//-----------------------------------------------------------------------------------------------------------------

    //how to assign values to priate data members
    // ans:- write public methods
    // methods should be called explicictly

    public void assignDefault(){
        day = 1 ;
        month = 7 ;
        year = 2004 ;
    }

//-----------------------------------------------------------------------------------------------------------------

    public void print (){
        System.out.println("Details are:" + day+ "/" + month + "/" + year);
    }

//-----------------------------------------------------------------------------------------------------------------

    /// Default constructor:- VVVIMPPPP
    // Constructor Syntax it never have return type:-
    public  Date (){
        System.out.println("Constructed executed by JVM ");
    }

//----------------------------------------------------------------------------------------------------------------

    /// Parameter constructor:- VVIMPPPP
    // Constructor Syntax it never have return type:-
    public  Date (int i , int j , int k){
        System.out.println("Constructor Parameter");
        day = i ;
        month = j ;
        year = k ;
    }

//-----------------------------------------------------------------------------------------------------------------
}
