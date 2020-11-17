package missiondsa180Ques.array;

import java.math.BigInteger;

public class NoOfSubarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        getSubarray(arr);
    }

    private static void getSubarray(int[] arr) {
        int subarrayCount = (int)Math.pow(2,arr.length);
        System.out.println(subarrayCount);

       // BigInteger.valueOf(3).testBit(4);
        for(int i = 0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ,");
                }
            }
        }

    }
}
