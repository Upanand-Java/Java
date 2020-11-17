package multithreading;

import java.util.LinkedList;
import java.util.List;

public class ProducerConsumer {
    public static void main(String[] args) throws InterruptedException {
         ProdCons prodCons = new ProdCons();

        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    prodCons.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    prodCons.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        producer.start();
        consumer.start();

        producer.join();
        consumer.join();
        System.out.println("Main thread");
    }

    public static class ProdCons{
        LinkedList<Integer> integers = new LinkedList<>();
        int capacity = 10;
        int val = 0;

        public void produce() throws InterruptedException {
            while(integers.size()<=10)
            synchronized (this){
                while (integers.size() == capacity) {
                    wait();
                }

                System.out.println("producer produce "+val);
                integers.add(val++);



                notify();
                Thread.sleep(1000);
            }
        }

        public void consume() throws InterruptedException {

            while(integers.size() !=0)
                synchronized (this){
                    while (integers.size() == 0) {
                        wait();
                    }

                    int value = integers.removeFirst();
                    System.out.println("Consumer consume "+value);



                    notify();
                    Thread.sleep(1000);
                }
        }


    }

}