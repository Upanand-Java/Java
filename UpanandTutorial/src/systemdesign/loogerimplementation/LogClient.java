package systemdesign.loogerimplementation;

public interface LogClient {

    void processStartTime(int processId);
    void processEndTime(int processId);
    String poll();
}
