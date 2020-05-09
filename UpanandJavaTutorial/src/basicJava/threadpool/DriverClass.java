package basicJava.threadpool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DriverClass {
    public static void main(String[] args) throws InterruptedException {
       final int max_t = 3;
        ExecutorService executorService = Executors.newFixedThreadPool(max_t);

        Runnable r1 = new ThreadPoolSample("task1");
        Runnable r2 = new ThreadPoolSample("task2");
        Runnable r3 = new ThreadPoolSample("task3");
        Runnable r4 = new ThreadPoolSample("task4");
        Runnable r5 = new ThreadPoolSample("task5");

        executorService.execute(r1);
        Thread.currentThread().join();

        executorService.execute(r2);
      //  Thread.currentThread().join();

        executorService.execute(r3);
        Thread.currentThread().join();
        executorService.execute(r4);
        Thread.currentThread().join();
        executorService.execute(r5);
        Thread.currentThread().join();

        executorService.shutdown();
        Thread.currentThread().join();
    }
}
