package sapient;

public class SyncFeatures {
    public static class inside{
        public static synchronized void m1() throws InterruptedException {
            System.out.println("under s1");
            Thread.sleep(1000);
        }
        public static synchronized void m2() throws InterruptedException {
            System.out.println("under s2");
            Thread.sleep(1000);
        }
    }
    public static void main(String[] args) {
        inside i = new inside();
        Runnable r = ()->{
            try {
                i.m1();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        };
        Runnable r1 = ()->{
            try {
                i.m2();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        };
        Thread thread = new Thread(r);
        Thread thread1 = new Thread(r1);

        thread.start();
        thread1.start();

    }
}
