package multithreading;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.*;

public class ThrdDemo {
    public static void main(String[] args) {
        Queue<Integer> integers = new LinkedList<>();
        Queue<Integer> integers1 = new ConcurrentLinkedQueue<>(); // thread safe
        ConcurrentLinkedQueue linkedQueue = new ConcurrentLinkedQueue(); // thread safe
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(); // thread safe

        ConcurrentMap<Integer,Integer>  C = new ConcurrentHashMap<>(); //thread safe !!
        Map integerIntegerMap = new HashMap<>();

        //concurrentHashMap.put(null,null); it will throw null pointer exception
        //because it use compareAndSet instead of assignment

        ConcurrentSkipListSet<Integer> integers2 = new ConcurrentSkipListSet<>();
        integers2.add(12);
        integers2.add(12);

        BlockingQueue blockingQueue = new LinkedBlockingQueue();
        blockingQueue.add(false);

        System.out.println(blockingQueue);




        System.out.println(integers2);



        integerIntegerMap.put(null,null);

        System.out.println(integerIntegerMap);

        System.out.println(concurrentHashMap);
    }
}
