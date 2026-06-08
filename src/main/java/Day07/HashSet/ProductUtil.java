package Day07.HashSet;

import java.util.HashSet;

public class ProductUtil  {

    public static HashSet<Product> getAllPrd(){

        HashSet<Product> prdMap = new HashSet<Product>();

        prdMap.add(new Product (101,"book" , 899) );
        prdMap.add(new Product (103,"Pen" , 101) );
        prdMap.add(new Product (104,"KeyChain" , 100) );
        return prdMap;

    }
}
