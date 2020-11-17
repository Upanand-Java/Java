package javadoc;

public class DeadLockOwn {
    final String a = "a";
    final String b = "b";

    public  void m1(){
        synchronized (a){
            System.out.println("I required lock1 to access");

            synchronized (b){
                System.out.println("I required lock2 to access");
            }
        }
    }

    public  void m2(){
        synchronized (a){
            System.out.println("I required lock2 to access");

            synchronized (b){
                System.out.println("I required lock1 to access");
            }
        }
    }

    public static void main(String[] args) {
        DeadLockOwn deadLockOwn = new DeadLockOwn();
       Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                deadLockOwn.m1();
                deadLockOwn.m2();
            }
        });


      Thread t2 =  new Thread(new Runnable() {
            @Override
            public void run() {

                deadLockOwn.m1();
                deadLockOwn.m2();
            }
        });
        t1.start();
      t2.start();
    }

}
