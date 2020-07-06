package javadoc;

import java.util.Date;
import java.util.concurrent.*;

public class CallableSample {

    Callable<String> callable = ()->{

       Thread.sleep(100);
        //System.out.println("my name is upanand");
        return Thread.currentThread().getName();
        //return "hey";
    };


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(10);

        for(int j=0;j<100;j++) {
            Future<String> future = executor.submit(new CallableSample().callable);
            System.out.println(new Date()+" "+future.get());
        }

        executor.shutdown();


    }
}
