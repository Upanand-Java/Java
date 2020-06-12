package dataStructure.hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "aba";
        String str = "dog cat cat";

        HashSet<Character> strings = new HashSet<>();
        String[] s = str.split(" ");
        LinkedHashMap<Character,String> linkedHashMap = new LinkedHashMap<>();

        for(int i =0;i<pattern.length();i++){
            strings.add(pattern.charAt(i));
        }

        HashSet<String> stringHashSet = new HashSet<>();

        for(String x:s){
            stringHashSet.add(x);
        }

        if(stringHashSet.size() != strings.size()){
            System.out.println("false");
        }else {
            for (int i = 0; i < pattern.length(); i++) {
                if (linkedHashMap.containsKey(pattern.charAt(i)) && !linkedHashMap.get(pattern.charAt(i)).equals(s[i])) {
                    System.out.println("inside false");
                }
                linkedHashMap.put(pattern.charAt(i), s[i]);


            }
        }

        //System.out.println("true");






       /*// for (int j=0;j<s.length;j++)
        for(int i=0;i<pattern.length();i++) {
            if(linkedHashMap.containsKey(pattern.charAt(i)) && !linkedHashMap.get(pattern.charAt(i)).equals(s[i])){
                System.out.println("false");
            }else{
                linkedHashMap.put(pattern.charAt(i),s[i]);
            }


        }*/
        //System.out.println(linkedHashMap);
       // System.out.println("true");
    }
}
