package dataStructure.hashtable;

import java.util.HashMap;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,3,5};
        int[] output = new int[2];

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            hashMap.put(nums[i],hashMap.getOrDefault(nums[i],0)+1);
        }

        System.out.println(hashMap);

        for(int i =0;i<nums.length;i++){
            if(hashMap.get(nums[i])==2){
                output[0] = nums[i];
                output[1] = nums[i]+1;
            }
        }

        System.out.println(output[0]+" and "+output[1]);
    }
}
