package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {
        int temp = 0;
        Arrays.sort(prices);

        for(int i =0;i<prices.length;i++){
            if(prices[i]>=k){
                temp = i;
                break;
            }else{
                temp=i;
            }
        }
        int sum = 0;
        int index =0;
        //System.out.println("temp is "+temp );

       for(int j = 0;j<=temp;j++){
           sum += prices[j];
           //System.out.println(sum);
           if(sum >= k){
              break;
           }
           index ++;
       }

    return index;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int arrayLen = scanner.nextInt();
        int cost = scanner.nextInt();

        int[] priceArray = new int[arrayLen];

        for(int i=0;i<arrayLen;i++){
            priceArray[i] = scanner.nextInt();
        }
        int result = maximumToys(priceArray,cost);
        System.out.println(result);
        scanner.close();

    }
}

