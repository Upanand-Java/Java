package missiondsa180Ques.dynamicprogrammng;

public class MaximumRodCutting {
    public static void main(String[] args) {
        int a = 4;
        int b =3;
        int c = 6;
        int n = 7;
        //int maxCut = getMaxCut(n,a,b,c);
        int maxCut = getMaxCutDP(n,a,b,c);
        System.out.println(maxCut);
    }

    private static int getMaxCut(int n, int a, int b, int c) {

        if(n<0)
            return -1;
        if(n == 0)
            return 0;


        int result = Math.max(Math.max(getMaxCut(n-a,a,b,c),
                getMaxCut(n-b,a,b,c)),getMaxCut(n-c,a,b,c));
        if(result == -1)
            return result;
        return result+1;
    }

    private static int getMaxCutDP(int n, int a, int b, int c) { //bottom up
        int[] dp = new int[n+1];
        dp[0] = 0;
        int result = 0;

        for(int i=1;i<=n;i++){
            dp[i] = -1;
            if(i-a>=0){
                dp[i] =  Math.max(dp[i],dp[i-a]);
            }
            if(i-b>=0){
                dp[i]=  Math.max(dp[i],dp[i-b]);
            }
            if(i-c>=0){
                dp[i] =  Math.max(dp[i],dp[i-c]);
            }
            if( dp[i] != -1){
                dp[i]++;
            }
        }

        return dp[n];

    }
}
