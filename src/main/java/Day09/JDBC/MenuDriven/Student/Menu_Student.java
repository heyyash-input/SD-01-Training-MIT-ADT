package Day09.JDBC.MenuDriven.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu_Student {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        Connection con = ConnectionUtil.getDbConnection();

        ArrayList<Student> students = new ArrayList<Student>();
//        students.
//        Student stud = new Student();

        Service_Student serStud = new Service_Student();
        System.out.println("1:Show Details");
        System.out.println("2:Insert values");
        System.out.println("3:Update values");
        System.out.println("4:EXIT");

        int ch;
        do {
            System.out.println("Enter your choice");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("--------Show all table details--------");
                    serStud.getAllDetails();
                    break;
                case 2:
                   System.out.println("--------Insert table details--------");
                    serStud.getAllInsert();
                    break;
                case 3:
                    System.out.println("--------Update table details--------");
                    serStud.getAllUpdate();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Enter valid details");
            }
        } while (ch != 5);
        System.out.println("-------------Exiting------------");
    }
}
