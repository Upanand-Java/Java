package sapient;

public class SyncFeatures {
    public static class inside{
        public static synchronized void m1(){
            System.out.println("under s1");
        }
        public static synchronized void m2(){
            System.out.println("under s2");
        }
    }
    public static void main(String[] args) {
        inside i = new inside();
        Runnable r = ()->{
            i.m1();

        };
        Runnable r1 = ()->{
            i.m1();

        };
        Thread thread = new Thread(r);
        Thread thread1 = new Thread(r1);

        thread.start();
        thread1.start();

    }
}
