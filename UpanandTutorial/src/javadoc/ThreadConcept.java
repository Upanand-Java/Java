package javadoc;

public class ThreadConcept {
    Runnable runnable = ()->{
      String m =  ThreadConcept.m1();
        System.out.println(m+" "+Thread.currentThread().getName());
    };

    private synchronized static String m1(){
        System.out.println();
        return "m1";
    }
    public static void main(String[] args)  {
        Thread thread = new Thread(new ThreadConcept().runnable);
        thread.start();
        Thread thread1 = new Thread(new ThreadConcept().runnable);
        thread1.start();
    }
}
