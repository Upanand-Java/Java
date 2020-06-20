package dataStructure.hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class IntersectionOfArray {
    public static void main(String[] args) {
        int[] nums1 = {1,3,4,3,4,5,6,5,2,7};
        int[] nums2 = {4,5,5,7,8,9,10,5};


        HashSet<Integer> integers = new HashSet<>();
        for(int i: nums1){
            integers.add(i);
        }
        System.out.println(integers);

        int index = 0;
        for(int j=0;j<nums2.length;j++){
            if(integers.contains(nums2[j])){
                nums2[index] = nums2[j];
                integers.remove(nums2[j]);
                index++;
            }
        }
        for(int k=0;k<index;k++){
            System.out.print(nums2[k]+" ,");
        }




    }
}
