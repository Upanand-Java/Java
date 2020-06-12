package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadBlockedState {
    public static void main(String[] args) {

        final Object lock = new Object();
        /*Lock lock1 = new ReentrantLock();
        lock1.lock();
        lock1.unlock();*/ // SO instead of synchronizedblock we can use Lock from java.util.concurrency.locks
        Runnable runnable = ()->{
            System.out.println("wait a little !!");
            synchronized (lock){
                while (true){
                    // thread blocked !!
                }
            }

        };

        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable);
        System.out.println("first thread "+thread.getState());
        System.out.println("Second thread "+thread1.getState());

        thread.start();
        thread1.start();
        System.out.println("After start "+thread.getState());
        System.out.println("After start second thread  "+thread1.getState());


    }
}
