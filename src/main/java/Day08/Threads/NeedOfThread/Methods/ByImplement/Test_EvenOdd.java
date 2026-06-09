package Day08.Threads.NeedOfThread.Methods.ByImplement;

public class Test_EvenOdd {

    public static void main(String[] args) {
//----------------------------------------------------------------------------------------------------------------

        System.out.println("---------Main Thread-------"+Thread.currentThread().getName());
        System.out.println();

        EvenThread even = new EvenThread();
        Thread t1 = new Thread(even);
        t1.start();

        OddThread odd = new OddThread();
        Thread t2 = new Thread(odd);
        t2.start();

        System.out.println();
        System.out.println("---------Main Thread-------"+Thread.currentThread().getName());

//----------------------------------------------------------------------------------------------------------------
    }
}
