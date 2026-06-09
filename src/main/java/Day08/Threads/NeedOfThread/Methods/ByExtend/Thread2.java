package Day08.Threads.NeedOfThread.Methods.ByExtend;

public class Thread2 extends Thread{

//-----------------------------------------------------------------------------------------------------------------

    @Override
    public void run (){
        System.out.println("----Thread2 is started------");

        for (int i = 10; i > 0 ; i--) {
            System.out.println("\t\t: " + i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("----Thread2 is Ended------");
    }
//-----------------------------------------------------------------------------------------------------------------
}
