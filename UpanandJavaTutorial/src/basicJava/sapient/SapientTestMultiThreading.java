package basicJava.sapient;

import java.util.ArrayList;
import java.util.List;

public class SapientTestMultiThreading {



    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new ArrayList<>(5);
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(5);




        Thread t1 = new Thread(new Runnable() {
            @Override
            public  void run() {
                synchronized (list) {
                    try {
                        list.wait();
                        for (int i : list) {
                            System.out.print(i + ",");
                        }
                        Thread.sleep(777);


                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    notifyAll();

                }

            }
        });



        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (list) {
                    try {
                        list.wait();

                    for (int j : list) {
                        System.out.print(j + ",");
                    }

                    } catch (InterruptedException e) {

                    }
                    notifyAll();
                }

            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();



    }


}
