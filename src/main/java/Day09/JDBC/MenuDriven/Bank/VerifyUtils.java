package Day09.JDBC.MenuDriven.Bank;

public class VerifyUtils {
//----------------------------------------------------------------------------------------------------------------
    public static boolean isValidEmail(String email) {

        return email.contains("@") &&
                email.endsWith(".com");
    }

//----------------------------------------------------------------------------------------------------------------
}
