package Day09.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Test_insert {
    public static void main(String[] args) throws SQLException {
//---------------------------------------------------------------------------------------------------------------
        Connection con = ConnectionUtil.getDbConnection();

        Scanner sc = new Scanner(System.in);

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

//---------------------------------------------------------------------------------------------------------------
    }
}
