package systemdesign.loogerimplementation;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LoggerImpl implements LogClient {
    TreeMap<Integer,Process> map;
    long time = System.currentTimeMillis();

    public LoggerImpl() {
        this.map = new TreeMap<>();
    }

    @Override
    public void processStartTime(int processId) {
        map.put(processId , new Process(time  , processId));

    }

    @Override
    public void processEndTime(int processId) {
        map.get(processId).setEndTime(System.currentTimeMillis());
    }

    @Override
    public String poll() {
        Process process = map.firstEntry().getValue();
        System.out.println("hey "+process.getEndTime());
        System.out.println(map);
        if(process.getEndTime() != -1){
            //here we are printing the logger
            System.out.println(process.getId()+" start time "+process.getStartime()+"end time "+process.getEndTime());
            map.remove(process.getId());
            System.out.println("inside "+map);
            return "";
        }
        return null;
    }
}
