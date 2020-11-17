package multithreading;

import org.omg.PortableServer.THREAD_POLICY_ID;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProducerConsumerAgain {
    LinkedList<Integer> list = new LinkedList<Integer>();
    int capacity = 10;



    public synchronized void produce() throws InterruptedException {
        int i = 0;
        while (true) {
            while (list.size() == capacity)
                wait();



            list.add(i++);
            System.out.println("producer produces"+i);
            Thread.sleep(1000);
            notifyAll(); // here we notify consumer thread to consume the resource after bucket fill
        }
    }

        public synchronized void consume() throws InterruptedException {

            while(true){
                while (list.size()==0)
                    wait();

               int val = list.removeFirst();
                System.out.println("Consumer consumes "+val);

                Thread.sleep(1000);
                notifyAll();

            }
        }



    public static void main(String[] args) throws InterruptedException {
        ProducerConsumerAgain again = new ProducerConsumerAgain();

        Runnable pro = ()->{
            try {
                again.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable cons = ()->{
            try {
                again.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread producer = new Thread(pro);
        Thread consumer = new Thread(cons);

        producer.start();
        consumer.start();

       // producer.join();
        //consumer.join();
    }






}
