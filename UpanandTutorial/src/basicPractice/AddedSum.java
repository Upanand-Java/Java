package basicPractice;

import java.util.Arrays;

public class AddedSum {
    public static void main(String[] args) {
        int[] arr = {2,7,14,15};
        int sum = 16;
       int[] result =  pairSum(arr ,sum);
        System.out.println(Arrays.toString(result));
    }

    private static int[] pairSum(int[] arr, int sum) {
        int start = 0;
        int end = arr.length-1;

        while(end>start){
           if((arr[start]+arr[end])>sum ){
               end --;
           } else if((arr[start]+arr[end])<sum){
               start ++;
           }else {
            return new int[]{arr[start] , arr[end]};
           }


        }
        throw new IllegalArgumentException("No such pair !!");
    }
}
