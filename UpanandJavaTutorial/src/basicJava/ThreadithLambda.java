package basicJava;

/**
 * We can pass the thread job as a lambda expression in the argument of thread class !!
 */
public class ThreadithLambda {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{for(int i=0;i<10;i++)
        {
            System.out.println("Child thread !!");
        }
        });
        thread.start();
        for(int i=0;i<10;i++){
            System.out.println("Main thread !!");
        }
    }

}
