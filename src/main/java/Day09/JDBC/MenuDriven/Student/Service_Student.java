package Day09.JDBC.MenuDriven.Student;

import java.sql.*;
import java.util.Scanner;

public class Service_Student extends Student {
    //----------------------------------------------------------------------------------------------------------------
    Scanner sc = new Scanner(System.in);
    Connection con = ConnectionUtil.getDbConnection();

    //----------------------------------------------------------------------------------------------------------------
    public void getAllDetails() throws SQLException {
        // For showing details:-
        String sql = "select * from student";
        Statement stmt = con.createStatement(); // handle statement too
        ResultSet rset = stmt.executeQuery(sql);

        while (rset.next()) {
            System.out.println(rset.getInt("roll_no") + " | "
                    + rset.getString("name") + " | "
                    + rset.getString("city") + " | "
                    + rset.getDouble("marks") + " | ");
        }
        rset.close();
    }

    //----------------------------------------------------------------------------------------------------------------
    public void getAllUpdate() throws SQLException {

        System.out.println("Enter rollno to edit");
        int rollno = sc.nextInt();
        System.out.println("Name city marks");
        String name = sc.next();
        String city = sc.next();
        double marks = sc.nextDouble();

        // Write - Prepared statemnt:-
        String sqlUpdate = "update student set name=? , city=? , marks=? where roll_no=?";

        PreparedStatement stmt = con.prepareStatement(sqlUpdate);
        stmt.setString(1, name);
        stmt.setString(2, city);
        stmt.setDouble(3, marks);
        stmt.setInt(4, rollno);

        int row = stmt.executeUpdate();// does not return resutSet so create int
        System.out.println(row + "Updated");
        con.close();
    }

    //----------------------------------------------------------------------------------------------------------------
    public void getAllInsert() throws SQLException {

        int rollno ; String name , city  ;
        double marks ;

        System.out.println(" RollNo  , Name ,  City  , Marks");
        rollno = sc.nextInt(); ;
        name = sc.next();
        city = sc.next();
        marks = sc.nextDouble();

        String sqlInsert = "insert into student values(?, ? , ? , ?)";
        PreparedStatement pstmt = con.prepareStatement(sqlInsert);

        pstmt.setInt(1,rollno);
        pstmt.setString(2,name);
        pstmt.setString(3,city);
        pstmt.setDouble(4,marks);

        int row = pstmt.executeUpdate();
        System.out.println(row+"Inserted");
    }
//----------------------------------------------------------------------------------------------------------------
}
