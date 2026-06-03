package Day03.OOPS_Fundamentals.AccessModifiers.DateAccess;

import java.util.Scanner;

public class Test_Date {
    public static void main(String[] args) {

//---------------------------------------------------------------------------------------------------------------
        Scanner sc = new Scanner(System.in);

//---------------------------------------------------------------------------------------------------------------

        Date date = new Date();
        date.assignDate(03, 07, 2004);
        date.displayInfo();

//---------------------------------------------------------------------------------------------------------------

        Date date1 = new Date();
        date1.assignDate(2, 8, 2004);
        date1.displayInfo();

//---------------------------------------------------------------------------------------------------------------

        System.out.println("-------Enter date/month/year-------");
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();
        date.assignDate(d, m, y);
        date.displayInfo();

//---------------------------------------------------------------------------------------------------------------
    }
}
