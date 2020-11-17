package systemdesign.loogerimplementation;

public class Process {
   private final long startime ;
    private  long endTime ;
     private   int id;

    public Process(long startime,  int id) {
        this.startime = startime;
        this.endTime = -1;
        this.id = id;
    }

    public long getStartime() {
        return startime;
    }

    public long getEndTime() {
        return endTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setEndTime(long endTime){
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Process{" +
                "startime=" + startime +
                ", endTime=" + endTime +
                ", id=" + id +
                '}';
    }
}
