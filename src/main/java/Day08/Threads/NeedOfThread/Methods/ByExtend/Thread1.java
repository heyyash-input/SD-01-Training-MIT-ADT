package Day08.Threads.NeedOfThread.Methods.ByExtend;

public class Thread1 extends Thread{
//-----------------------------------------------------------------------------------------------------------------
    //must override run methode in subclass (child classs)
    public void run(){
        System.out.println("----Thread1 starts here " + Thread.currentThread().getName());

        for (int i = 0; i < 10 ; i++) {
            System.out.println(i);
            try {
                Thread1.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("----Thread1 End here " + Thread.currentThread().getName());
    }

//-----------------------------------------------------------------------------------------------------------------
}
