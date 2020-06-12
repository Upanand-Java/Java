package missiondsa180Ques.array;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,3,4,0,0,0};
        int m = 3;
        int[] nums2 = {1,2,6};
        //int n = nums2.length;

        int longArrayTail = m-1;
        int shortArrayTail = nums2.length-1;

        while(longArrayTail>=0 && shortArrayTail>=0){

            if(nums1[longArrayTail]> nums2[shortArrayTail]){

                nums1[longArrayTail+shortArrayTail+1] = nums1[longArrayTail];

                longArrayTail--;
            }else{

                nums1[longArrayTail+shortArrayTail+1] = nums2[shortArrayTail];
                shortArrayTail--;
            }
        }

        while (shortArrayTail>=0)
        {
            nums1[shortArrayTail] = nums2[shortArrayTail];
            shortArrayTail--;

        }

        for(int i:nums1){
            System.out.print(i+" ");
        }




    }
}
