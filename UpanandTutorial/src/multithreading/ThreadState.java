package multithreading;

public class ThreadState {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("THread state "+Thread.currentThread().getState());

        Runnable runnable = ()-> System.out.println("In runnable");

        Thread thread = new Thread(runnable);
        System.out.println("THread state after creation "+thread.getState());

        thread.start();
        System.out.println("state "+thread.getState());

        Thread.sleep(1000);

        thread.join();
        System.out.println("killing state "+thread.getState());

    }
}
