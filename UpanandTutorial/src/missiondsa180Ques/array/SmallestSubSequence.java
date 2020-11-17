package missiondsa180Ques.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallestSubSequence {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 5, 6, 3, 7, 9, 14, 10, 2, 5};
        int k = 35;
        //int k = 70;
        //int k=-1;
        int maxSubArray = findMaxSubArray(arr,k);
        System.out.println(maxSubArray);
    }

    private static int findMaxSubArray(int[] arr, int k) {
        Arrays.parallelSort(arr,0,arr.length);
        List<Integer> ls = new ArrayList<Integer>();
      //int[] a =  ls.toArray();
        // Arrays.parallelSort(ls.toArray(new Object[ls.size()]) , 0,5);
        int sum =0;
        int count =0;
        for(int j=arr.length-1;j>=0;j--){
            sum+= arr[j];
            count++;

            if(sum >= k)
                break;

        }
        return k>sum?-1:count;
    }
}
