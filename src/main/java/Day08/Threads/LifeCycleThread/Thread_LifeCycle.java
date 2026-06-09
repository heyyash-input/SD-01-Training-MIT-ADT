package Day08.Threads.LifeCycleThread;

import Day08.Threads.NeedOfThread.Methods.ByExtend.Thread1;

public class Thread_LifeCycle {
//-----------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) throws InterruptedException {
//-----------------------------------------------------------------------------------------------------------------
        MyThread obj = new MyThread();
        Thread t1 = new Thread(obj); // Thread born: new
        t1.start(); // -- ready to run ----> runnable

//        System.out.println("T1 Dead: " + t1.isAlive()); -----> False
        t1.join(5000);
        System.out.println("T1 Dead: " + t1.isAlive());
        System.out.println("----------Main over ");
//-----------------------------------------------------------------------------------------------------------------
        try {
            t1.join(); // main thread will wait till t1 get over
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        System.out.println("T1 Dead: " + t1.isAlive()); ----> True
        // main thread get over : dead

//-----------------------------------------------------------------------------------------------------------------
    }
}
