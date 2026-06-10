package Day09.JDBC.MenuDriven.Student;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {

    public static Connection getDbConnection(){
//---------------------------------------------------------------------------------------------------------------

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("----------Driver Loaded Successfully---------");

            Connection con = DriverManager.getConnection("Your_URL","Your_Root","Your_Password");
            System.out.println("-------Connected to DB--------");
            return con ;
        }
        catch (Exception ex ){
            ex.printStackTrace();
        }
        return null ; // ---------->  inCase of exception

//---------------------------------------------------------------------------------------------------------------
    }
}
