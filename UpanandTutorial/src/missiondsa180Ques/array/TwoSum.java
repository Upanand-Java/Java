package missiondsa180Ques.array;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {8,9,7,6,4};
        int sum = 12;

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int required = sum - nums[i];
            if(hashMap.containsKey(required) && hashMap.get(required) != i){
                System.out.println(nums[i]+" "+nums[hashMap.get(required)]);
                break;

            }else {
                hashMap.put(nums[i],i);
            }

        }
        hashMap.put(12,null);
        hashMap.put(88,null);
        hashMap.put(null,null);

        //System.out.println(hashMap.get(12).getClass());
        try {

            System.out.println("in try");
            System.out.println(hashMap.get(null).getClass() + "" + hashMap.containsKey(88));
        }catch (NullPointerException e){
            System.out.println("hey");
            e.printStackTrace();
        }
        System.out.println("hello");
    }
}
