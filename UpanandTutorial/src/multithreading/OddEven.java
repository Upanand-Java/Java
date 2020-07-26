package multithreading;

public class OddEven {
   static int i = 0;
   static boolean isFalse  = false;
   static int MAX = 19;
    static class inner{
        public void getEvenNum() throws InterruptedException {
            synchronized (this){
                while (i<MAX) {
                    while (isFalse) {
                        wait();
                    }
                    i++;
                    System.out.println(i);
                    isFalse = true;
                    notify();
                    Thread.sleep(1000);
                }
            }

        }
        public void getOddNum() throws InterruptedException {
            synchronized (this){

                while (i<MAX) {
                    while (!isFalse)
                        this.wait();
                    i++;
                    System.out.println(i);
                    isFalse = false;
                    notify();
                    Thread.sleep(1000);
                }

            }

        }
    }
    public static void main(String[] args) {
        inner i = new inner();
        Runnable runnable = ()-> {
            try {
                i.getEvenNum();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable runnable1 = ()-> {
            try {
                i.getOddNum();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread evenThread = new Thread(runnable);
        Thread oddThread = new Thread(runnable1);

        evenThread.start();
        oddThread.start();



    }
}
