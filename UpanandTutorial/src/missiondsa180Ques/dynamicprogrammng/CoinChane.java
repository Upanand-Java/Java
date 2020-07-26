package missiondsa180Ques.dynamicprogrammng;

public class CoinChane {
    public static void main(String[] args) {
        int[] coins = {6,5,4};
        int amount = 8;
        int result =  getCount(coins,coins.length,amount);
        //return result;
        System.out.println(result);
    }

    private static int getCount(int[] coins,int n,int val){
        int[] dp = new int[val+1]; //val is the value and it will through numbber of coins
        dp[0] =0;
        for(int i=1;i<dp.length;i++){
            dp[i] = Integer.MAX_VALUE;

        }
        //0,999,999,999,999,999,999,999,999
        for(int i=1;i<dp.length;i++){
            for(int j=0;j<n;j++){
                if(coins[j]<=i){
                    System.out.println(coins[j]+" "+i);
                    int sub_res = dp[i-coins[j]];
                    if(sub_res !=Integer.MAX_VALUE) {
                        dp[i] = Math.min(dp[i],sub_res+1);
                    }
                }
            }
        }
        return dp[val];

    }
}
