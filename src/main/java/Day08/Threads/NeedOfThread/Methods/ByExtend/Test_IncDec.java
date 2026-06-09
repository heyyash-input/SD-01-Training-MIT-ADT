package Day08.Threads.NeedOfThread.Methods.ByExtend;

public class Test_IncDec {
    public static void main(String[] args) {
        System.out.println("-------Main Thread STARTS "+Thread.currentThread().getName());
        System.out.println();

        Thread1 t1 = new Thread1();
        t1.setName("Increment Thread");
        t1.start();

        Thread2 t2 = new Thread2();
        t2.setName("Decrement Thread");
        t2.start();

        System.out.println();
        System.out.println("-------Main Thread ENDs "+Thread.currentThread().getName());
    }
}
