package dataStructure.hashtable;

import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        int[] ints = {1,3,3,1,4,5,5};
        int i =0;
        HashMap<Integer,Integer> hashMap = new HashMap<>(ints.length);
       // hashMap.put(ints[0],1);
        while (i != ints.length) {
            if (hashMap.containsKey(ints[i])){
                hashMap.put(ints[i], hashMap.get(ints[i]) + 1);
            }else {
                hashMap.put(ints[i],0);
            }

            i++;
        }

        System.out.println(hashMap);
       for(Map.Entry<Integer,Integer> entry: hashMap.entrySet()){
           if(entry.getValue()==0){
               System.out.println(entry.getKey());
           }
       }

    }
}
