package javadoc;

public class Multithreading {
    Runnable runnable = ()->{
        System.out.println("THread started "+Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("THread End "+Thread.currentThread().getName());
    };



    public static void main(String[] args) throws InterruptedException {
        Thread t =  new Thread(new Multithreading().runnable);
        t.start();
        t.join();

        Thread t2 =  new Thread(new Multithreading().runnable);
        t2.start();
        t2.join();



        Thread t1 =  new Thread(new Multithreading().runnable);
        t1.start();
       // t1.join(1000);
    }
}
