package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class ExecutorSample {
    public static void main(String[] args) {
        ExecutorService service = null;

        ThreadFactory factory = new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                return null;
            }
        };

        ThreadFactory factory1 = (r)->{ // basically thread factory is a funtional Interface which has one
            //abstract method newThread which take argument as a runnable and return thread , So here we can
            //define thread and there feature so that it could be useful in creating the thread-pool
            Thread thread = new Thread(r);
            thread.setName("Thread1");
            thread.setDaemon(false);
            thread.setPriority(5);
            return thread;
        };

        service = Executors.newCachedThreadPool(); //Executors has private access for default constructor
        service = Executors.newCachedThreadPool(factory1);                                         // So we cant create the object.
        service = Executors.newFixedThreadPool(3,factory1);

        service = Executors.newSingleThreadExecutor(); // All the submitted task performed by single thread

        service =Executors.newSingleThreadExecutor();
    }
}
