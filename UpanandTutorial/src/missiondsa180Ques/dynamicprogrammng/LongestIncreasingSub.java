package missiondsa180Ques.dynamicprogrammng;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSub {
    public static void main(String[] args) {
        int[] nums = {3,2,4,5,8,9,2,1};
        List<Integer> list = new ArrayList<>();

        list.add(0 ,nums[0]);
        for(int i=1;i<nums.length;i++){
            if(list.get(list.size()-1)<nums[i]){

                list.add(list.size() , nums[i]);
               // System.out.println("inside "+nums[i]+" "+list);
            }else{
                int c  = ceilingIdx(list,0,list.size()-1,nums[i]);
                //list.add(c,nums[i]);
                list.set(c,nums[i]);
              //  System.out.println(list);
            }
        }
        System.out.println(list.size());
        System.out.println(list);
    }

    private static int ceilingIdx(List<Integer> nums, int low, int high, int num) {
        while (high>low){
            int m = low+(high-low)/2;
            if(nums.get(m)>= num){
                high = m;
            }else {
                low = m+1;
            }
        }
      //  System.out.println(high);
        return high;
    }
}

 /*if(nums.length == 0)
         return 0;

         int[] lis = new int[nums.length];
         lis[0]=1;

         for(int i=1;i<nums.length;i++){
        lis[i] = 1;
        for(int j=0;j<i;j++){
        if(nums[i]> nums[j])
        {
        lis[i] = Math.max(lis[i],lis[j]+1); //if there is the existence of small then atleast it should be increented by coz of self occurence
        }
        }

        }

        int res = lis[0];

        for(int i: lis){
        res = Math.max(res,i);
        }

        return res;*/
