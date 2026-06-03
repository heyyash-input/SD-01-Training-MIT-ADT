package Day03.OOPS_Fundamentals.AccessModifiers.BookStoreAccess;

public class Book {

//----------------------------------------------------------------------------------------------------------------

    private int bookId ;
    private String name , author;
    private double price ;

//----------------------------------------------------------------------------------------------------------------

    public void assign(int id ,String nm ,String auth  , double pri){
        bookId = id ;
        name = nm ;
        author = auth ;
        price =  pri ;
        System.out.println("----Assign Details----");
    }

//----------------------------------------------------------------------------------------------------------------

    public void displayInfo(){
        System.out.println("Book Details:" + bookId +" "+name +" "+ author+ " $"+price);
    }

//----------------------------------------------------------------------------------------------------------------
}
