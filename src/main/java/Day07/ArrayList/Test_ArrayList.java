package Day07.ArrayList;

import java.util.ArrayList;

public class Test_ArrayList {
    public static void main(String[] args) {
//----------------------------------------------------------------------------------------------------------------

        ArrayList<String> strList = new ArrayList<String>();
        //size:0 isEmpty:True
        //capacity:10(not fixed) ---> elements add it extends by size 10
        System.out.println("isEmpty: " + strList.isEmpty() + "   Size: " + strList.size());

//----------------------------------------------------------------------------------------------------------------

        //add 1st element
        strList.add("yash");
        System.out.println("isEmpty: " + strList.isEmpty() + "   Size: " + strList.size());

//----------------------------------------------------------------------------------------------------------------

        strList.add("sham");
        strList.add("Ram");
        strList.add("Gham");
        strList.add("yaam");
        System.out.println("isEmpty: " + strList.isEmpty() + "   Size: " + strList.size());

//----------------------------------------------------------------------------------------------------------------

        System.out.println(strList);

        //display element one by one
        //iterate strList
        //for(int i=0 ; i < strList.size() ; i ++)

        //how to iterate collection:
        //use adv for each loop

//----------------------------------------------------------------------------------------------------------------

        //[yash, sham, Ram, Gham, yaam]
        //for each loop:
        // starts with 1st element till last
        // fwd only
        // read only

        for (String str : strList) { // we use for each loop
            System.out.println(str);
        }

//----------------------------------------------------------------------------------------------------------------
    }
}
