package synechron;

import java.util.*;

public class MapAndSortString {
    public static void main(String[] args) {
        String s = "the the word word were ewe were ere esr esr ear qw w q the the the word were were";
        String[] arr = s.split(" ");
        LinkedHashMap<String,Integer> hashMap = new LinkedHashMap<>();
        for(int i=0;i<=arr.length-1;i++){
            if(hashMap.containsKey(arr[i])){
               hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }else{
                hashMap.put(arr[i],1);
            }
        }
        System.out.println(hashMap);
        Set<Map.Entry<String,Integer>> entries = hashMap.entrySet();
        List<Map.Entry<String,Integer>> entries1 = new ArrayList<>(entries);
        Collections.sort(entries1,Comparator.comparingInt(e->-e.getValue()));

        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>(entries1.size());

        for(Map.Entry<String,Integer> entry:entries1){
            linkedHashMap.put(entry.getKey(),entry.getValue());
        }
        System.out.println("After sorting");
        System.out.println(linkedHashMap);
        for(Map.Entry<String,Integer> result: linkedHashMap.entrySet()){
            System.out.println(result.getKey()+" : "+result.getValue());
        }
    }

}
