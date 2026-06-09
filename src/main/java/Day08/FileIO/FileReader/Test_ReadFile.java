package Day08.FileIO.FileReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class Test_ReadFile {
    public static void main(String[] args) {
//----------------------------------------------------------------------------------------------------------------

        try {
            FileReader fr =new FileReader("MyData.txt");
//                                     = new BufferedReader( reader object)
            BufferedReader reader = new BufferedReader(fr);

            String str = null ;
            // Reads line by line then prints exact same
            while( ( str = reader.readLine() )!= null){
                System.out.println(str);
            }
            reader.close();
        }

        catch (Exception e){
            e.printStackTrace();
        }

//----------------------------------------------------------------------------------------------------------------

    }
}
