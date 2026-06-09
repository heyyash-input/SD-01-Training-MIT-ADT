package Day08.Shop;

import java.io.PrintWriter;

import java.util.ArrayList;

public class ProductUtil {
//----------------------------------------------------------------------------------------------------------------
    public static ArrayList<Product> getAllPrds(){
        ArrayList<Product> allPrds = new ArrayList<Product>();
        allPrds.add(new Product(101,"Pen" , 89));
        allPrds.add(new Product(102,"Book" , 89));
        allPrds.add(new Product(103,"Chalk" , 89));
        allPrds.add(new Product(104,"Pencil" , 89));
        return allPrds ;
    }
//----------------------------------------------------------------------------------------------------------------

    public static void writePrdIntoFile(String fileName , ArrayList<Product> list ){

        try {
            PrintWriter writer = new PrintWriter(fileName);
            for(Product p : list ){
                writer.println(p);
            }
            writer.close();
            System.out.println("Done with copying");
        }
        catch (Exception ex ){
            ex.printStackTrace();
        }

//----------------------------------------------------------------------------------------------------------------
    }
}
