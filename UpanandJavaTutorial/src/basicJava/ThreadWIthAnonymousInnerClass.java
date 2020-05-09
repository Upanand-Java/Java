package basicJava;

public class ThreadWIthAnonymousInnerClass {
    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    System.out.println("CHild thread !!");
                }
            }
        };
        thread.start();
        for(int i=0;i<10;i++){
            System.out.println("Main thread !!");
        }
    }
}
