package missiondsa180Ques.hastable;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubarraywithSum0 {
    public static void main(String[] args) {
        //int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
        int[] arr = {-1,1,-1,1};
        int k = 2;
       // int[] arr

        //we need to put in hashmap , sum as a key and index as value

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        int[] sum = new int[arr.length];

        int sumValue = 0;
        //hashMap.put(sum , 0);

        for (int i = 0; i <arr.length;i++){
          sumValue = sumValue+arr[i];
          sum[i] = sumValue;

        }

        System.out.println("Sum array is :");

        for(int o: sum){
            System.out.print(" ,"+o);
        }


        int lengthIndex = 0;
        for(int i=0;i<sum.length;i++){
            if (sum[i]==0)
                lengthIndex = 1 + i;
            if(hashMap.containsKey(sum[i])  ){
             int diff =   i- hashMap.get(sum[i]);

             if(diff> lengthIndex){
                 lengthIndex = diff;
             }

            }else{
                hashMap.put(sum[i] , i);
            }
        }
        System.out.println(hashMap);
        System.out.println("largest length is "+lengthIndex);









    }
}
