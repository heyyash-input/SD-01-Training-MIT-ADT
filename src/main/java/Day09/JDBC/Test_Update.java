package Day09.JDBC;

import Day09.JDBC.MenuDriven.Student.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Test_Update {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        Connection con = ConnectionUtil.getDbConnection();

        System.out.println("Enter rollno to edit" );
        int rollno=sc.nextInt();
        System.out.println("Name city marks" );
        String name =sc.next();
        String city =sc.next();
        double marks=sc.nextDouble();

        // Write - Prepared statemnt:-
        String sqlUpdate = "update student set name=? , city=? , marks=? where roll_no=?";

        PreparedStatement stmt = con.prepareStatement(sqlUpdate);
        stmt.setString(1,name);
        stmt.setString(2,city);
        stmt.setDouble(3,marks);
        stmt.setInt(4,rollno);

        int row = stmt.executeUpdate();// does not return resutSet so create int
        System.out.println(row+ "Updated");
        con.close();

    }
}
