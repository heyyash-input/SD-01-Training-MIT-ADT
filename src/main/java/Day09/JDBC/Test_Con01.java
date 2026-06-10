package Day09.JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test_Con01 {

    public static void main(String[] args) {
//----------------------------------------------------------------------------------------------------------------
        try {
            Connection con = ConnectionUtil.getDbConnection(); // rather than creating always new
            System.out.println("--------Connect uitl working fine -------");

            //Step2: sql
            String sql = "select * from student";

            // Step 3: associate sql with connection
            //use statement
            Statement stmt = con.createStatement(); // handle statement too

            //Step 4: Fire / execute query on db side
            //use Statement methods
            // use ResultSet for storing query output:
            // executeQuery method is used in select query (Interview question)
            // executeUpdate method is used in Insert , update , delete
            ResultSet rset = stmt.executeQuery(sql);

            //Step 5:
            while (rset.next()) {
                System.out.println(rset.getInt("roll_no") + " | "
                        + rset.getString("name") + " | "
                        + rset.getString("city") + " | "
                        + rset.getDouble("marks") + " | ");
            }
            rset.close();
//
//            String sql2 = " Select * from Student where roll_no = ?"  + input ;
//            Statement stmt2 = con.createStatement();
//            ResultSet rset1 = stmt2.executeUpdate(sql2);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("-----------END----------");
//-----------------------------------------------------------------------------------------------------------------
    }
}
