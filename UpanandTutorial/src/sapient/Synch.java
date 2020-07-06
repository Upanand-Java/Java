package sapient;


public class Synch {
    // Sleeps for 5 seconds
    private static void do_stuff() { //
        try {
            System.out.println(Thread.currentThread().getName()+" priority is "+Thread.currentThread().getPriority());
            Thread.sleep(5000);
        } catch(InterruptedException e) {}
    }
    public synchronized  void m1() {
        System.out.println("In m1");
        do_stuff();
    }
    public synchronized void m2() {
        System.out.println("In m2");
        do_stuff();
    }
    public static void main(String[] args) {
        System.out.println("ok");
        Synch s = new Synch();
        Thread t1 = new Thread() {
            public void run() {

                s.m1();
            }
        };
        Thread t2 = new Thread() {
            public void run() {

                s.m2();
            }
        };
        t1.start();
        t2.start();
        System.out.println(Thread.currentThread().getName()+" what ?? "+Thread.currentThread().getPriority());
        System.out.println("Done");
    }
}

/*public class Synch {
    public synchronized void m1() {
    }
    public synchronized void m2() {
        m1();
    }
    public static void main(String[] args) {
        Synch s = new Synch();
        s.m2();
        System.out.println("Done");
    }
}*/
