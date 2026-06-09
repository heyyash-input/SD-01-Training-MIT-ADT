package Day08.Threads.NeedOfThread.Methods.ByImplement;

public class OddThread implements Runnable {
//---------------------------------------------------------------------------------------------------------------
    @Override
    public void run (){
        System.out.println("\n -----------------Odd Thread Started------------"+Thread.currentThread().getName());

        for (int i = 0; i <= 10; i++) {
            if(i%2!=0){
                System.out.println("Odd: " + i );
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace(); // to get the error code
                }
            }
        }

        System.out.println("\n -----------------Odd Thread Ended------------"+Thread.currentThread().getName());
     }
//---------------------------------------------------------------------------------------------------------------
}
