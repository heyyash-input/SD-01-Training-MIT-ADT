package Day06.Containment_Enum;

import java.util.Scanner;

public class Test_Product {
    public static void main(String[] args) {
//----------------------------------------------------------------------------------------------------------------
        Scanner sc = new Scanner(System.in);
        System.out.println("Id name cate: oils,rains,other");
//----------------------------------------------------------------------------------------------------------------
        int prdid = sc.nextInt();
        String pName = sc.next();
        System.out.println("D / M / Y");
        Date dom = new Date(sc.nextInt(), sc.nextInt(), sc.nextInt() ) ;
//----------------------------------------------------------------------------------------------------------------
        String cate = sc.next();
//----------------------------------------------------------------------------------------------------------------
        Product prd = new Product(prdid,pName,dom,cate);
        prd.display();
//----------------------------------------------------------------------------------------------------------------
        Product prd1 = new Product(prdid , pName , dom , cate);
        prd.display();
//----------------------------------------------------------------------------------------------------------------
    }
}
