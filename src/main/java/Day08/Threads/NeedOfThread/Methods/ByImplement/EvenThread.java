package Day08.Threads.NeedOfThread.Methods.ByImplement;

import Day08.Threads.NeedOfThread.Methods.ByExtend.Thread1;

public class EvenThread implements Runnable{
//----------------------------------------------------------------------------------------------------------------

    @Override
    public void run(){
        System.out.println("\n -----------------Even Thread Started------------"+Thread.currentThread().getName());

        for (int i = 0; i <= 10; i++) {
            if(i%2==0){
                System.out.println("Even: " + i );
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace(); // to get the error code
                }
            }
        }

        System.out.println("\n -----------------Even Thread Ended------------"+Thread.currentThread().getName());
    }

//----------------------------------------------------------------------------------------------------------------
}
