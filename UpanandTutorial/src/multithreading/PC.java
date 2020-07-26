package multithreading;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PC{
    public PC(){}
    List<Integer> integers = new ArrayList<>(10);

    int capacity =10;

    public  void produce () throws InterruptedException {

        int val =1;
        while(true) {
            synchronized (this) {
                while (integers.size() == 10)
                    wait();

                System.out.println("Producer producing " + integers);


                integers.add(val++);


                notify();

                Thread.sleep(1500);


            }
        }

    }

    public  void consume () throws InterruptedException {


            while(true) {
                synchronized (this) {
                    while (integers.size() == 0)
                        wait();

                    int i =0;

                    integers.remove(i);
                    i = i+1;
                    System.out.println("Consumer consuming " + integers);





                    notify();

                    Thread.sleep(1500);


                }
            }



    }
}

