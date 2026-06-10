package Day09.JDBC.MenuDriven.Bank;

import Day09.JDBC.MenuDriven.Bank.ConnectionUtil;

import java.sql.*;
import java.util.Scanner;

public class Service_Bank extends VerifyUtils {

//----------------------------------------------------------------------------------------------------------------
    Scanner sc = new Scanner(System.in);
    Connection con = ConnectionUtil.getDbConnection();

//----------------------------------------------------------------------------------------------------------------
    public void getAllEmployee() throws SQLException {
        // For showing details:-
        String sql = "select * from employee";
        Statement stmt = con.createStatement(); // handle statement too
        ResultSet rset = stmt.executeQuery(sql);

        while (rset.next()) {
            System.out.println(rset.getInt("emp_id") + " | "
                    + rset.getString("emp_user") + " | "
                    + rset.getString("emp_email") + " | "
                    + rset.getString("emp_pass") + " | ");
        }
        rset.close();
    }

//----------------------------------------------------------------------------------------------------------------
    public void getAllUpdate() throws SQLException {

        System.out.println("Enter emp id  to edit");
        int emp_id  = sc.nextInt();

        System.out.println("Enter new user name and email");
        String empName = sc.next();
        String empEmail = sc.next();

        //email verification:-
        if(!isValidEmail(empEmail)){
            System.out.println("---Enter valid email---");
            return;
        }

        // Write - Prepared statemnt:-
        String sqlUpdate = "update employee set emp_user=? , emp_email=?  where emp_id=?"; // not password

        PreparedStatement stmt = con.prepareStatement(sqlUpdate);
        stmt.setString(1, empName);
        stmt.setString(2, empEmail);
        stmt.setInt(3, emp_id);

        int row = stmt.executeUpdate();// does not return resutSet so create int
        System.out.println(row + "Updated");

    }
//---------------------------------------------------------------------------------------------------------------
    public void getAllInsert() throws SQLException {

        int empId ; String empName , empEmail  ;
        String empPass  ;

        System.out.println(" Employe id  , Name ,  email  , pass");
        empId= sc.nextInt(); ;
        empName= sc.next();
        empEmail= sc.next();
        if(!isValidEmail(empEmail)){
            System.out.println("---Enter valid email---");
            return;
        }
        empPass= sc.next();

        String sqlInsert = "insert into employee values(?, ? , ? , ?)";

        PreparedStatement pstmt = con.prepareStatement(sqlInsert);
        pstmt.setInt(1,empId);
        pstmt.setString(2,empName);
        pstmt.setString(3,empEmail);
        pstmt.setString(4,empPass);

        int row = pstmt.executeUpdate();
        System.out.println(row+"Inserted");
    }
//----------------------------------------------------------------------------------------------------------------
    public void getAllDelete() throws SQLException {

        System.out.println("Enter emp id  to delete");
        int emp_id  = sc.nextInt();

        // Write - Prepared statemnt:-
        String sqlUpdate = "DELETE FROM employee WHERE emp_id = ?;"; // not password

        PreparedStatement stmt = con.prepareStatement(sqlUpdate);
        stmt.setInt(1, emp_id);

        int row = stmt.executeUpdate();// does not return resutSet so create int
        System.out.println( "Deleted");

    }
//----------------------------------------------------------------------------------------------------------------
    public void getById() throws SQLException {

        System.out.println("Enter emp id  to fetch");
        int emp_id  = sc.nextInt();

        // Write - Prepared statemnt:-
        String sqlUpdate = "SELECT * FROM employee WHERE emp_id = ?"; // not password

        PreparedStatement stmt = con.prepareStatement(sqlUpdate);
        stmt.setInt(1, emp_id);

        ResultSet rs = stmt.executeQuery();


        if (rs.next()) {
            System.out.println(
                    rs.getInt("emp_id") + " | " +
                            rs.getString("emp_user") + " | " +
                            rs.getString("emp_email") + " | " +
                            rs.getString("emp_pass")
            );
        } else {
            System.out.println("Employee not found");
        }
        rs.close();
        stmt.close();
    }
//----------------------------------------------------------------------------------------------------------------
//    public void getLogin() throws SQLException {
//        System.out.println("Enter emp name and password to login ");
//        String empUser = sc.next();
//        String empPass = sc.next();
//
//        // Write - Prepared statemnt:-
//        String sqlLogin = "SELECT * FROM employee WHERE emp_user = ? and emp_pass = ?"; // not password
//
//        PreparedStatement stmt = con.prepareStatement(sqlLogin);
//        stmt.setString(1, empUser);
//        stmt.setString(2, empPass);
//
//        ResultSet rs = stmt.executeQuery();
//
//        if (rs.next()) {
//            System.out.println("-------Login Successfull-----");
//            System.out.println(
//                    rs.getInt("emp_id") + " | " +
//                            rs.getString("emp_user") + " | " +
//                            rs.getString("emp_email")
//            );
//
//        } else {
//            System.out.println("-----Invalid id or Pass----");
//        }
//        rs.close();
//        stmt.close();
//    }

    public boolean getLogin() throws SQLException {

        System.out.println("Enter username and password");

        String empUser = sc.next();
        String empPass = sc.next();

        String sql =
                "SELECT * FROM employee WHERE emp_user=? AND emp_pass=?";

        PreparedStatement stmt = con.prepareStatement(sql);

        stmt.setString(1, empUser);
        stmt.setString(2, empPass);

        ResultSet rs = stmt.executeQuery();

        boolean success = rs.next();

        rs.close();
        stmt.close();

        return success;
    }
//----------------------------------------------------------------------------------------------------------------
}
