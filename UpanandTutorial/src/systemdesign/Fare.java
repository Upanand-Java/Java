package systemdesign;

public class Fare {
    protected int baseFare;
    protected int baseTime;
    protected int incrementalFare;
    protected int incrementalTime;

    public Fare(int baseFare, int baseTime, int incrementalFare, int incrementalTime) {
        this.baseFare = baseFare;
        this.baseTime = baseTime;
        this.incrementalFare = incrementalFare;
        this.incrementalTime = incrementalTime;
    }

    public void setNewFareCharges(int baseFare, int baseTime, int incrementalFare, int incrementalTime) {
        this.baseFare = baseFare;
        this.baseTime = baseTime;
        this.incrementalFare = incrementalFare;
        this.incrementalTime = incrementalTime;
    }


}
