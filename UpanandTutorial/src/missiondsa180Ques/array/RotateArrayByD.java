package missiondsa180Ques.array;

import java.util.Arrays;

public class RotateArrayByD {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int d = 3;
        //4567123
        //4567567
        rotateArray(arr , d);
    }

    private static void rotateArray(int[] arr, int d) {
        int[] temp = new int[d];

        for(int i=0;i<d;i++)
            temp[i] = arr[i];
        int val = 0;
        for(int i=d;i<arr.length;i++)
            arr[val++] = arr[i];

        int k=0;
        for(int i=(arr.length-d);i<arr.length;i++)
            arr[i] = temp[k++];
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(temp));
    }
}
