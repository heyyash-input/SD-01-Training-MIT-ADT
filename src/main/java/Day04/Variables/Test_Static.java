package Day04.Variables;

import java.util.Scanner;

public class Test_Static {
    public static void main(String[] args) {
//-------------------------------------------------------------------------------------------------------------

        Scanner sc = new Scanner(System.in);

//-------------------------------------------------------------------------------------------------------------

        StaticVariableFund.displayClg();
        System.out.println();

//-------------------------------------------------------------------------------------------------------------

        StaticVariableFund  fund1 = new StaticVariableFund();
        fund1.displatInfo();
        StaticVariableFund  fund2 = new StaticVariableFund(21);
        fund2.displatInfo();
        System.out.println("-----------END--------");

//-------------------------------------------------------------------------------------------------------------

    }
}
