package missiondsa180Ques.hastable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonChar {
    public static void main(String[] args) {
        String[] A = {"bella","label","roler","eloll","eollp"};

        HashMap<Character,Integer> hm = new  HashMap<Character,Integer>();
        HashMap<Character,Integer> count = new  HashMap<Character,Integer>();
        HashMap<Character,Integer> tempMap = new  HashMap<Character,Integer>();
        List<String> ls = new ArrayList<>();
        for(int i=0;i<A[0].length();i++)
            hm.put(A[0].charAt(i),hm.getOrDefault(A[0].charAt(i),0)+1);

        for(int j=1;j<A.length;j++){
            for(int k=0;k<A[j].length();k++){
                count.put(A[j].charAt(k),count.getOrDefault(A[j].charAt(k),0)+1);
            }
            for(Map.Entry<Character,Integer> entry: count.entrySet()){
                for(Map.Entry<Character,Integer> prev: hm.entrySet()){
                    if(entry.getKey() == prev.getKey()){
                        if(entry.getValue()<= prev.getValue())
                          tempMap.put(entry.getKey(),entry.getValue());
                        else
                            tempMap.put(entry.getKey(),prev.getValue());

                    }
                }
            }
            hm.clear();
            hm.putAll(tempMap);
            tempMap.clear();
            count.clear();

        }

        for(Character c: hm.keySet()){
            for(int k=0;k<hm.get(c);k++){
                ls.add(c.toString());
            }
        }

        System.out.println(hm);
        System.out.println(ls);

    }
}
