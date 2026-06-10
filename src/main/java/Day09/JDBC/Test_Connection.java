package Day09.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test_Connection {
    public static void main(String[] args) {
//----------------------------------------------------------------------------------------------------------------
        try {
            Class.forName("com.mysql.cj.jdbc.Driver") ; // Reflection
            System.out.println("----------Driver Loaded--------");

            //Step1: Connection
          Connection con = DriverManager.getConnection("Your_URL","Your_Root","Your_Password");
            System.out.println("----Connected to DB------");

        } catch (Exception e) {
            e.printStackTrace();
        }
//----------------------------------------------------------------------------------------------------------------
    }
}
