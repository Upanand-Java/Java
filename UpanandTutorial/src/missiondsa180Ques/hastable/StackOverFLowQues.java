package missiondsa180Ques.hastable;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class StackOverFLowQues {
    public static void main(String[] args) {
        LinkedHashMap<String ,Integer> linkedHashMap = new LinkedHashMap<>();
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        linkedHashMap.put("May2021",1);
        linkedHashMap.put("May2022",5);
        linkedHashMap.put("Apr2020",8);
        linkedHashMap.put("May2020",1);
        linkedHashMap.put("Apr2021",5);
        linkedHashMap.put("Apr2022",8);

        for(Map.Entry<String,Integer> entry: linkedHashMap.entrySet()){
            if(treeMap.containsKey(Integer.parseInt(entry.getKey().substring(3)))){
               int temp =  treeMap.get(Integer.parseInt(entry.getKey().substring(3)));
               int value = temp+entry.getValue();
               treeMap.put(Integer.parseInt(entry.getKey().substring(3)),value);

            }else{
                treeMap.put(Integer.parseInt(entry.getKey().substring(3) ),entry.getValue());
            }
        }
       // System.out.println(  Math.min(Math.min(0,-1),1));
       // Arrays.fill(new int[1][1],0);
        System.out.println(treeMap);

    }
}
