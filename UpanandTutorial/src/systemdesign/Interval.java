package systemdesign;

 class Interval {
    protected int startHour;
    protected int startMin;
    protected int endHour;
    protected int endMin;

    public Interval(int startHour, int startMin) {
        this.startHour = startHour;
        this.startMin = startMin;
    }

    public void setEndTime(int endHour, int endMin) {
        this.endHour = endHour;
        this.endMin = endMin;
    }

    public String getElapsedTime(String curTime) {
        String[] parts = curTime.split(":");
        int cur = Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
        int total = cur - ((startHour * 60) + startMin);
        return total/60 + ":" + total%60;
    }

    public String getTotalTime() {
        return getElapsedTime(endHour + ":" + endMin);
    }
}
