package Day07.CustomDataTypes;

import java.util.ArrayList;

public class ProductUtil {

    public static ArrayList<Product> getAllPrds(){
//----------------------------------------------------------------------------------------------------------------
        ArrayList<Product> list = new ArrayList<Product>();

        Product p1 = new Product(101,"Pen",12);
        list.add(p1);

        list.add(new Product(103 , "Book" , 50 ));
        list.add(new Product(104 , "Pen" ,89));
        list.add(new Product(203 , "Choclate" ,78));
        list.add(new Product(206 , "Bags" , 68));

        return list ;
//----------------------------------------------------------------------------------------------------------------
    }
}
