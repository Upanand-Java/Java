package missiondsa180Ques.array;

public class maxProfit {
    public static void main(String[] args) {
        int[] prices = {33,3,40};
        int result = maxProfit(prices);
        int totalProfits = totalProfit(prices);
        System.out.println("Total profit is "+totalProfits);
        System.out.println("our result is "+result);
    }

    private static int maxProfit(int[] prices){
        int result = 0;
        int buyingPrice = 0;


        /*for(int i=0;i<prices.length;i++){

            for(int j =i+1;j<prices.length;j++){

                if(result<(prices[j]-prices[i])){
                    result = prices[j] - prices[i];
                }
            }


            }*/
        buyingPrice = prices[0];

        for(int i=1;i<prices.length;i++){
           // result = prices[i] - buyingPrice;

            if(buyingPrice > prices[i]  ){
                buyingPrice = prices[i];
            }else if(buyingPrice<prices[i]){
                int diff = prices[i]-buyingPrice;
                if(result<diff)
                    result=diff;
            }
        }

        return result;

    }

    private static int totalProfit(int[] prices) { // if there is 1 brokerage
        int totalProfit = 0;
        for(int i =0; i<prices.length-1 ; i++ ){
            if (prices[i]<prices[i+1]){
                totalProfit += prices[i+1] - prices[i]-1;
            }


        }

        return totalProfit;

    }
}
