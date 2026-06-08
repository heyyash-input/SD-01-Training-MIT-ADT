package Day07.HashSet;

import java.util.HashSet;

public class MySetUtil {

    public static HashSet<Integer> getAllNumbers(){
//----------------------------------------------------------------------------------------------------------------

        HashSet<Integer> map = new HashSet<Integer>();
        map.add(10); //true
        map.add(11); // true
        map.add(50); // true
        map.add(79); // true
        map.add(90); // true
        return map ;
    }
//----------------------------------------------------------------------------------------------------------------

    public static HashSet <String> getAllStrings(){
        HashSet<String> strMap = new HashSet<String>();

        strMap.add("Abc"); // true
        strMap.add("yash"); // true
        strMap.add("ram"); // true
        strMap.add("ram"); // false
        return strMap ;
    }

//----------------------------------------------------------------------------------------------------------------
}
