package missiondsa180Ques.array;

import java.util.Arrays;

/**
 * Problem statement: If input array given the range 'M' integer then
 * what would be the maximum count of any individual integer.
 */
public class MaxFrequency {
    public static void main(String[] args) {
        int[] arr = {3,2,1,6,7,5,0,4,8};
        int M = 8;
        int result = getMaxCount(arr,M);
        System.out.println(result);

    }

    private static int getMaxCount(int[] arr, int m) {
        int[] temp = new int[m+1];
        int index = 0;
        int max_occurence = 1;
        Arrays.fill(temp,0);
        for(int i=0;i<arr.length;i++){
            if(temp[arr[i]]>0){
                int count = temp[arr[i]];
                if(count>max_occurence){
                    max_occurence = count;
                    index =i;
                }
                temp[arr[i]] = count+1;

            }else{
                temp[arr[i]] = 1;
            }
        }
        return arr[index];
    }
}
