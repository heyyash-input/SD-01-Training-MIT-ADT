package Day03.OOPS_Fundamentals.Functions_Types;

public class Test_MathOperations {

//----------------------------------------------------------------------------------------------------------------

    //Calling simple function :-
    public void add() {
        System.out.println("---Addition---");
    }

//---------------------------------------------------------------------------------------------------------------

    //Calling with parameters:-
    public void sum(int i, int j) {
        System.out.println("---Addition---");
        int k = i + j;
        System.out.println("Addition is:- " + k);
    }

//---------------------------------------------------------------------------------------------------------------

    //Function with parameters and return type int:-
    public int larger(int i, int j) {
        System.out.println("---largest---");

        if (i > j) {
            System.out.println("larger no:-" + i);
            return i;
        } else {
            System.out.println("larger no:-" + j);
            return j;
        }
    }

//-----------------------------------------------------------------------------------------------------------------

    //Function with parameters and return type int:-
    public int smaller(int i, int j) {
        System.out.println("---smaller---");
        if (i < j) {
            System.out.println("smaller no:-" + j);
            return j;
        } else {
            System.out.println("smaller no:-" + i);
            return i;
        }
    }

//---------------------------------------------------------------------------------------------------------------

    //Function for array reverse:-
    public int evenOrOdd(int i) {
        if (i % 2 == 0) {
            System.out.println("number is even:-" + i);
        } else {
            System.out.println("number is odd:-" + i);
        }
        return i;
    }

//----------------------------------------------------------------------------------------------------------------

    //Sorting Array:-
    public int [] sortinArr (int [] arr ){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr ;
    }

//----------------------------------------------------------------------------------------------------------------

}
