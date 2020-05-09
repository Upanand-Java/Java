package basicJava.hackerearth;

public interface StatisticsAggregator {
    public void putNewPrice(String symbol, double price);

    // Get the average price
    public double getAveragePrice(String symbol);

    // Get the total number of prices recorded
    public int getTickCount(String symbol);
}
