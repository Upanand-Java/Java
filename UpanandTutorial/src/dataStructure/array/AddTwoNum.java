package dataStructure.array;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class AddTwoNum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,9};
        int target = 11;
        HashMap<Integer , Integer> hashMap = new HashMap<>(arr.length);
        for(int i =0;i<arr.length;i++){
            int anotherNumber = target - arr[i];
            if(hashMap.containsKey(anotherNumber) && hashMap.get(anotherNumber) != arr[i]){
               // return new int[]{hashMap.get(anotherNumber),i};

            }
            else{
                hashMap.put(arr[i],i);
            }
            throw new IllegalArgumentException("no sum");
        }
    }
}
