package dataStructure.hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class IntersectionOfArray {
    public static void main(String[] args) {
        int[] nums1 = {1,3,4,3,4,5,6,5,2,7};
        int[] nums2 = {4,5,5};


        HashSet<Integer> integers1 = new HashSet<>();



        for(int i:nums2) integers1.add(i);


        List<Integer> list= new ArrayList<>();

        for(int i: nums1){
            if(integers1.contains(i)){
              // list.add(i);
                int[] opt = {i};
               integers1.remove(i);
            }
        }
        int[] result = new int[list.size()];


        int index=0;




        for(int i=0;i<list.size();i++){
            System.out.println("under "+list.get(i));
            result[index++] = list.get(i);

        }

        for(int i:result)
        System.out.println(i);


    }
}
