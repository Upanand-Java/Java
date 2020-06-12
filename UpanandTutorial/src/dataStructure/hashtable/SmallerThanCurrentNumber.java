package dataStructure.hashtable;

import java.util.Arrays;
import java.util.HashMap;

public class SmallerThanCurrentNumber {
    public static void main(String[] args) {



        int[] nums = {7,7,7,7,7,7};
        int[] output = new int[nums.length];

        int[] sortedArr = new int[nums.length];

        for(int i=0;i<sortedArr.length;i++){
            sortedArr[i] = nums[i];
        }

        Arrays.sort(sortedArr);

        HashMap<Integer ,Integer> hashMap = new HashMap<>();

        for(int i=0;i<sortedArr.length;i++){
            if(!hashMap.containsKey(sortedArr[i])){
                hashMap.put(sortedArr[i],i);
            }
        }
        System.out.println(hashMap);

        for(int i=0;i<output.length;i++){
            output[i] = hashMap.get(nums[i]);
        }

        for (int j :output){
            System.out.print(j);
        }


    }
}
