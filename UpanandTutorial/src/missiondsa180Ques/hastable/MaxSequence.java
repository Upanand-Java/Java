package missiondsa180Ques.hastable;

import java.util.HashSet;

public class MaxSequence {
    public static void main(String[] args) {
        int[] arr = {200,3,2,300,4,6,5};
        HashSet<Integer> integers = new HashSet<>(arr.length);

        for(int i=0;i<arr.length;i++){
            integers.add(arr[i]);
        }

        //int firstNumber = 0;
        int maxSubsequnce =0;
        for(int i=0;i<arr.length;i++){
            if(!integers.contains(arr[i]-1)){
               int max = arr[i];
               while (integers.contains(max)){
                   max++;
               }
               if(maxSubsequnce<max-arr[i])
                   maxSubsequnce = max-arr[i];


            }

        }

        System.out.println(maxSubsequnce);




    }


}
