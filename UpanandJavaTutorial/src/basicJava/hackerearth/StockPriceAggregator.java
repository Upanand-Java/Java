package basicJava.hackerearth;
import java.util.*;

public class StockPriceAggregator {
    public static class StatisticsAggregatorImpl implements StatisticsAggregator {
        String StockSymbol;
        double stockPrice;
        int tickCount = 0;

        public int getTickCount() {
            return tickCount;
        }

        public void setTickCount(int tickCount) {
            this.tickCount = tickCount;
        }


        public Map getStringMap() {
            return stringMap;
        }

        public void setStringMap(Map stringMap) {
            this.stringMap = stringMap;
        }

        Map stringMap = new HashMap<>();


        public String getStockSymbol() {
            return StockSymbol;
        }

        public void setStockSymbol(String stockSymbol) {
            StockSymbol = stockSymbol;
        }

        public double getStockPrice() {
            return stockPrice;
        }

        public void setStockPrice(double stockPrice) {
            this.stockPrice = stockPrice;
        }

        @Override
        public void putNewPrice(String symbol, double price) {
            Map map = new HashMap();
            map.put(symbol,price);
            setStringMap(map);




        }

        @Override
        public double getAveragePrice(String symbol) {
            // YOUR CODE HERE

            return 0;
        }

        @Override
        public int getTickCount(String symbol) {
            // YOUR CODE HERE
            return 0;
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            final StatisticsAggregator stats = new StatisticsAggregatorImpl();
            final Set<String> symbols = new TreeSet<>();

            String line = scanner.nextLine();
            String[] inputs = line.split(",");
            for (int i = 1; i < inputs.length; ++i) {
                String[] tokens = inputs[i].split(" ");
                final String symbol = tokens[0];
                symbols.add(symbol);
                final double price = Double.parseDouble(tokens[1]);

                stats.putNewPrice(symbol, price);

            }

            for (String symbol : symbols) {
                System.out.println(
                        String.format("%s %.4f %d", symbol, stats.getAveragePrice(symbol), stats.getTickCount(symbol)));
            }
        }
        scanner.close();

    }

}
