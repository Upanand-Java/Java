package missiondsa180Ques.stringques;

import java.util.*;

public class SortinDescendingOrder {
    public static void main(String[] args) {
        String s = "treeAAAAAAAAAuuuuuuuuuu";
        HashMap<Character,Integer> integerHashMap = new HashMap<>();
        for(int i=0;i<s.length();i++)
            integerHashMap.put(s.charAt(i),integerHashMap.getOrDefault(s.charAt(i),0)+1);


        Set<Map.Entry<Character,Integer>> entrySet = integerHashMap.entrySet();
        List<Map.Entry<Character,Integer>> entryList = new ArrayList<>(entrySet);
         Collections.sort(entryList,Comparator.comparingInt(e1 ->-e1.getValue()));
        //Collections.sort(entryList,(o1, o2) -> (o1.getValue()>o2.getValue())?-1:(o1.getValue()<o2.getValue())?1:0);
        String result = "";
        for(Map.Entry<Character,Integer> entry:entryList){
            Character c = entry.getKey();
            for(int i =0;i<entry.getValue();i++){
                result += entry.getKey();
            }
        }
        System.out.println(result);







    }
}
