package systemdesign;

 class Space implements Comparable<Space> {
    protected int spaceNo;
    protected Interval bookingInterval;
    protected boolean isEmpty;

    public Space(int spaceNo) {
        this.spaceNo = spaceNo;
        isEmpty = true;
    }

    public void startBooking(int startHour, int startMin) {
        bookingInterval = new Interval(startHour, startMin);
        isEmpty = false;
    }

    public String endBooking(int endHour, int endMin) {
        if (bookingInterval != null && !isEmpty) {
            bookingInterval.setEndTime(endHour, endMin);
            isEmpty = true;
            return bookingInterval.getTotalTime();
        }

        return "";
    }

    public void clearBooking() {
        isEmpty = true;
        bookingInterval = null;
    }

    @Override
    public int compareTo(Space other) {
        return spaceNo - other.spaceNo;
    }
}
