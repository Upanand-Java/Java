package systemdesign.loogerimplementation.client;

import systemdesign.loogerimplementation.LogClient;
import systemdesign.loogerimplementation.LoggerImpl;

public class Derived {
    public static void main(String[] args) {
        LogClient logClient = new LoggerImpl();
        logClient.processStartTime(1);
        logClient.processStartTime(2);


        logClient.poll();
        logClient.processEndTime(1);
        logClient.poll();
        logClient.processEndTime(2);
        logClient.poll();
    }
}
