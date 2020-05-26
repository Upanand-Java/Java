package dataStructure.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,-1,0,2,-2};
        int target = 0;

        HashMap<Integer,Integer> map = new HashMap<>();
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        int x = 0;

        for(int i=0;i<nums.length;i++){
           // l.clear();
            for(int j =i+1;j<nums.length;j++){
                for(int k= j+1;k<nums.length;k++){
                    for(int m = k+1;m<nums.length;m++){
                        if (target == nums[i]+nums[j]+nums[k]+nums[m])
                        {
                            //lists.add(l);
                            l.clear();
                            System.out.println("List is front "+l);
                            System.out.println("Main List is "+lists);
                            System.out.println("inside "+nums[i]);
                            System.out.println("inside "+nums[j]);
                            System.out.println("inside k "+nums[k]);
                            System.out.println("inside m "+nums[m]);
                            l.add(nums[i]);
                            l.add(nums[j]);
                            l.add(nums[k]);
                            l.add(nums[m]);
                            System.out.println("our List "+l);
                            lists.add(l);
                            System.out.println("Lists is "+lists);


                        }
                    }
                }
            }



        }
        System.out.println(lists);
    }
}
