package Day07.HashSet;

import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test_HashSet {
    public static void main(String[] args) {
//----------------------------------------------------------------------------------------------------------------
        HashSet<Integer> myNum= MySetUtil.getAllNumbers() ;
        System.out.println(myNum); // Un Ordered does not contain duplicate values

        myNum.add(101);
        myNum.add(99);
        System.out.println(myNum);
//        myNum.add(101); // false --> duplicate elements
//        myNum.add(99); // false  -->
        System.out.println(myNum.contains(100));

        TreeSet<Integer> sortedNumbers = new TreeSet<Integer>(myNum);
        System.out.println("-----Sorted-----");
        System.out.println(sortedNumbers);

//----------------------------------------------------------------------------------------------------------------

        HashSet<String> myStr = MySetUtil.getAllStrings();
        System.out.println(myStr); // no duplicates ram is not printed

        TreeSet<String> sortedStrings = new TreeSet<String>(myStr);
        System.out.println("---Sorted Strings----");
        System.out.println(sortedStrings); // ---> output: [Abc, ram, yash] alphabetically

//----------------------------------------------------------------------------------------------------------------

    }
}
