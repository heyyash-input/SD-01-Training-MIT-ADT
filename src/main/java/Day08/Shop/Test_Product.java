package Day08.Shop;

import java.util.ArrayList;

public class Test_Product {
//----------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        String fileName = "ProductDetails.txt" ;
        ArrayList<Product> allPrds = ProductUtil.getAllPrds();

        ProductUtil.writePrdIntoFile(fileName , allPrds);
        System.out.println();
    }
//----------------------------------------------------------------------------------------------------------------
}
