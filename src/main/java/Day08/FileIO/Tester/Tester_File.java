package Day08.FileIO.Tester;

import java.io.File;

public class Tester_File {

    public static void main(String[] args) {
//-----------------------------------------------------------------------------------------------------------------

//        String fileName = "C:\\nofile.txt";
        String fileName = "C:\\Users\\yashp\\Desktop\\nofile.txt";
        System.out.println("-----File----");
        //Create an object of file
        // import java.io
        File file = new File(fileName); // parametrised only

//-----------------------------------------------------------------------------------------------------------------

        try {
            if (file.exists()) {
                System.out.println("--File exist---");
                System.out.println("name: " + file.getName());
            System.out.println("canRead: " + file.getName());
            System.out.println("canWrite: " + file.canWrite());
            System.out.println("nameAbs: " + file.getAbsoluteFile());
            System.out.println("Path: " + file.getPath());
            } else {
                System.out.println("---Does not exist----");
                // no exist then create it
                file.createNewFile(); // check exception
                System.out.println("Creatd");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

//-----------------------------------------------------------------------------------------------------------------
    }
}
