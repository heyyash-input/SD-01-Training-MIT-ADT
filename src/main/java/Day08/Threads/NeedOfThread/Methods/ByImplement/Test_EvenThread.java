package Day08.Threads.NeedOfThread.Methods.ByImplement;

import Day08.Threads.NeedOfThread.Methods.ByExtend.Thread1;

public class Test_EvenThread {
    public static void main(String[] args) {
//----------------------------------------------------------------------------------------------------------------
        System.out.println("-------------Main Start-----------");

        EvenThread even  = new EvenThread();

        Thread t1 = new Thread(even);
        t1.start();

        System.out.println("-------------Main Ends--------------");
    }
//----------------------------------------------------------------------------------------------------------------
}
