package missiondsa180Ques.dynamicprogrammng;

import java.util.Arrays;

public class LongesSubSequence {
    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "abcgelf";
        int m = s1.length();
        int n = s2.length();
        //int result = LongSub(s1,s2,m,n);
        int result = findLong(s1,s2,m,n);
        System.out.println(result);
    }

    private static int LongSub(String s1, String s2, int m, int n) {
        int[][] arr = new int[m + 1][n + 1];
        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                arr[i][j] = -1;
            }
        }
            if(arr[m][n] != -1){
                return arr[m][n];
            }
            if(m==0 || n==0){
                arr[m][n] = 0;
            }else {
                if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
                    arr[m][n] = 1 + LongSub(s1, s2, m - 1, n - 1);
                } else {
                    arr[m][n] =  Math.max(LongSub(s1, s2, m, n - 1), LongSub(s1, s2, m - 1, n));
                }
            }
            return arr[m][n];

    }
    private static int findLong(String text1,String text2,int m,int n){
        int[][] dp =new int[m+1][n+1];

        for(int i =0 ;i<m+1;i++){
            dp[i][0] = 0;
        }
        for(int i =0 ;i<n+1;i++){
            dp[0][i] = 0;
        }
        for(int i =1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];

    }


}
