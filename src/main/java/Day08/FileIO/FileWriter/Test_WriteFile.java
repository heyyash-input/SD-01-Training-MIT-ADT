package Day08.FileIO.FileWriter;

import java.io.File;

public class Test_WriteFile {
    public static void main(String[] args) {

        try
        {
            PrintWriter writer = new PrintWriter(new File("MyInfo.txt"));
            System.out.println("This is my Info");
            System.out.println("Rollno:101");
            System.out.println("Name : Sonali ");
            System.out.println("City: Pune ");

        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
