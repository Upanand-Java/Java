package missiondsa180Ques.array;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,5,6,4,6,3,2,1,0};
        int[] res = new int[7];

        Arrays.fill(res , 0);
        for(int i =0;i<arr.length ; i++){
            res[arr[i]]++;
        }
        System.out.println(Arrays.toString(res));
        // 1,3,3,----
        for(int i=0;i<res.length;i++){
            int temp = res[i];
            while (temp>0) {
                System.out.print(i);
                temp--;
            }
        }

    }
}
