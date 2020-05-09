package multithreading;

public class ThreadTest implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            System.out.println("small Child thread");
        }
    }

    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        Thread thread1 = new Thread(threadTest);
        thread1.start();
        Thread thread = new Thread(new Runnable() {
            @Override
            public  void run() {
                for(int i=0;i<10;i++)
                    System.out.println("Child Thread");
            }
        });
        thread.start();
        for(int i=0;i<10;i++){
            System.out.println("Main thread !!");
        }
    }
}
