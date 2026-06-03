package Day03.OOPS_Fundamentals.Functions_Types;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
//---------------------------------------------------------------------------------------------------------------
        // create an object name test :-
        Test_MathOperations test = new Test_MathOperations();
//---------------------------------------------------------------------------------------------------------------
        // then call the function using " . ":-
        test.add();
//---------------------------------------------------------------------------------------------------------------
        // Passing parameter for object:-
        test.sum(34,89);
//---------------------------------------------------------------------------------------------------------------
        // now this requires parameters:
        test.larger(2,4);
//---------------------------------------------------------------------------------------------------------------
        // Passing parameter for object:-
        test.smaller(8,9);
//---------------------------------------------------------------------------------------------------------------
        //Odd or even
        test.evenOrOdd(4);
//---------------------------------------------------------------------------------------------------------------
        //sorting pass array as a parameter
        System.out.println("---Sorting Array---");
        // Needed to create new array
        int[] sortedResult = test.sortinArr(new int[]{56, 2, 1, 68, 7});
        System.out.println("Sorted Array: " + Arrays.toString(sortedResult));
//---------------------------------------------------------------------------------------------------------------

    }
}
