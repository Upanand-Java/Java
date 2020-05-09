package basicJava.threadpool;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadPoolSample implements Runnable {
    String taskname;

    public ThreadPoolSample(String taskname) {
        this.taskname = taskname;
    }


    @Override
    public void run() {
        for(int i = 0;i<5;i++){
            if(i==0){
                Date date = new Date();
                SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
                System.out.println("Thread initialize "+dateFormat.format(date)+"Thread name "+taskname);
            }else{
                Date date = new Date();
                SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
                System.out.println("After initialize "+dateFormat.format(date)+"Thread name "+taskname);

            }

            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
