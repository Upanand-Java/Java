package java8concept.interviewcall;

public class Multithreading {
    /*@Override
    public void run(){

    }*/



    public static void main(String[] args) {
        Runnable runnable = ()-> System.out.println("thread execution");
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);

      //  t1.start();
        t1.run();
        t1 = t2;

        t1.start();
        System.out.println("Main thread!!");
    }
}
