package Day08.Threads.NeedOfThread.Methods.ByExtend;

public class Test_Thread1 {
    public static void main(String[] args) {
//-----------------------------------------------------------------------------------------------------------------

        System.out.println("--------Main--------Starts-----"+ Thread.currentThread().getName());
        Thread1 t1 = new Thread1();
        t1.setName("Thread1");
        t1.start(); //

        Thread2 t2 = new Thread2();
        t2.setName("Thread2");
        t2.start();
//        Thread.sleep(5000);

        System.out.println("--------Main--------END-----"+ Thread.currentThread().getName());

//-----------------------------------------------------------------------------------------------------------------
    }
}
