package multithreading.threadsequence;

public class ThreadSequenceWithLambdaExp {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = ()->{
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Running thread "+Thread.currentThread().getName());
        };
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);
        Thread t4 = new Thread(runnable);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        t4.start();
        t4.join();
        Thread.sleep(3000);
        System.out.println("Finished Executing with sequencing!! "+Thread.currentThread().getName());
    }
}
