package Day08.Threads.LifeCycleThread;

import Day08.Threads.NeedOfThread.Methods.ByExtend.Thread1;

public class MyThread implements Runnable {

    public void run(){
        System.out.println("----MyThread starts here " + Thread.currentThread().getName());

        for (int i = 0; i <= 20 ; i++) {
            System.out.println(i);
            try {
                Thread1.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("----MyThread End here " + Thread.currentThread().getName());
    }

}
