package Day02;


import java.util.Arrays;
import java.util.Scanner;

public class ArraysFundamentals {

    public static void main(String[] args) {

//----------------------------------------------------------------------------------------------------------

        Scanner sc = new Scanner(System.in);

//--------------------------------------------------------------------------------------------------------------
        // what is array?
         //array is a collection or fixed sized or static size variable index based data structure
        // mechansim works on refrence meomry pointing to heap

//-------------------------------------------------------------------------------------------------------------

        int [] arr = {1 , 2,3 , 4, 5 ,6 ,7 ,8 ,9 ,10};
//        System.out.println(arr[0]);

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        reverse(arr);
//------------------------------------------------------------------------------------------------------------

//        Dyanamic Array
//        int [] arr1 = new int[5];
//        // if not defined we will get 0 as a output
//        System.out.println(arr1[1]);

//-------------------------------------------------------------------------------------------------------------
//        printOdd(sc,arr);

//        arraySum(sc,arr);
        int [] arr2 = {1,2,3,4,5};
        int [] arr3 = {2,3,4,5,6,7};
        int [] arr4= {6,7,8,9,10};
//        Con(sc,arr2,arr3);

//----------------------------------------------------------------------------------------------------------

        System.out.println(Arrays.toString(methode2Con(sc,arr2 ,arr4)));

        String [] str = {"Yash" , "Raghav" };
        String  [] str2 = {"Pam" , "Don"};

    }

//---------------------------------------------------------------------------------------------------------

    public static void reverse(int arr []){
        int start =0 ;
        int end = arr.length-1 ;
        while (start <= end ){
            int temp = arr[start];
            arr[start] = arr [end];
            arr[end] = temp ;
            start++;
            end--;
        }
    }

//-------------------------------------------------------------------------------------------------------------

    public static void arrayPrint(Scanner sc , int arr[]){
        System.out.println("------------------Enter Array-----------------");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("--------Array Elements are-------------");
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }

//-------------------------------------------------------------------------------------------------------------

    //accept array upto 10 and print odd
    public static void printOdd(Scanner sc , int arr [] ){
        System.out.println("Enter array");

        for (int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();

            if(arr[i] %2==0 && arr[i] < 50){
                System.out.println("Even are:" + arr[i]);
            }
            else{
                System.out.println("Odd are:" + arr[i]);
            }
        }
    }

//--------------------------------------------------------------------------------------------------------------

    public static void arraySum(Scanner sc , int arr []){
        System.out.println("Enter number ");

        for (int i = 0; i < arr.length ; i++) {
            arr[i]=sc.nextInt();

            if(arr[i] >= 0){
                int sum = arr[i] + arr[i+1];
                System.out.println("sum addition is:" + sum);
            }
        }
    }

//----------------------------------------------------------------------------------------------------------

    public static int []  Con(Scanner sc , int arr2[]  , int arr3[]){

        if(arr2.length != arr3.length){
            return new int[0];
        }

    int sumArray [] = new int[arr2.length];
        for (int i = 0; i < arr3.length; i++) {
            sumArray[i] = arr2[i] + arr3[i] ;
        }
        return sumArray ;
    }

//-----------------------------------------------------------------------------------------------------------

    public static int [] methode2Con(Scanner sc , int arr2 [] , int arr4 []){
        int s1 = arr2.length ;
        int s2 = arr4.length;
        int s3 = s1 + s2 ;

        int [] arr3  = new int[s3];
        int index= 0 ;
        for ( index = 0 ; index < s1 ; index++){
            arr3[index] = arr2[index];
        }

        for (int i = 0; i < s2; i++) {
            arr3[index] = arr4[i];
            index++;
        }
        return  arr3 ;
    }

//------------------------------------------------------------------------------------------------------------
//
//    public static String [] stringCon(Scanner sc , String [] str , String [] str2){
////        String  s1 = str.;
//
//    }


}
