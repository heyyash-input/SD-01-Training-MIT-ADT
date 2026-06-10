package Day09.JDBC.MenuDriven.Bank;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Menu_Bank {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        Connection con = ConnectionUtil.getDbConnection();

        Service_Bank servBank = new Service_Bank();

        // first verify login:-
        if (!servBank.getLogin()) {
            System.out.println("Login Failed");
            return;
        }

        System.out.println("Login Successful");

        int ch;
        do {
            System.out.println("1:Show Details");
            System.out.println("2:Create Employee");
            System.out.println("3:Update Employee");
            System.out.println("4:Delete Employee");
            System.out.println("5:Get Employee by empId");
//            System.out.println("6:LogOff"); ----> future scope

            System.out.println("Enter your choice");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("--------Show all Employee-------");
                    servBank.getAllEmployee();
                    break;
                case 2:
                    System.out.println("--------Create Employee--------");
                    servBank.getAllInsert();
                    break;
                case 3:
                    System.out.println("--------Update Employee Details--------");
                    servBank.getAllUpdate();
                    break;
                case 4:
                    System.out.println("-------Delete Employee--------");
                    servBank.getAllDelete();
                    break;
                case 5:
                    System.out.println("-------Get Employee by id--------");
                    servBank.getById();
                    break;
//                Future Scope:-
//                case 6:
//                    System.out.println("-------Login--------");
//                    servBank.getLogin();
//                    break;
                default:
                    System.out.println("Enter valid details");
            }
        } while (ch != 5);
        System.out.println("-------------Exiting------------");

    }
}
