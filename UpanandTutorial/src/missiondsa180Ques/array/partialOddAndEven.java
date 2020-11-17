package missiondsa180Ques.array;

import java.util.Arrays;

public class partialOddAndEven {
    public static void main(String[] args) {
       // int[] arr = {1,2,4,5,6,8,9,4,2,7};
        int[] arr = {1,2,3,4,5};
        int end = arr.length-1;
        int start = 0;

        while(start<end){
            if(arr[start]%2==0){
                start++;
            }else if(arr[start]%2 !=0){
                swapVal(arr,start,end);
                end--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swapVal(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}
