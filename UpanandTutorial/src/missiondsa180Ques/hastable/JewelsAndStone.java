package missiondsa180Ques.hastable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JewelsAndStone {
    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbbb";




        HashMap<Character, Integer> hashMap = new HashMap<>();

       // Set<Integer> integers = new HashSet<>(hashMap.values())

        for(int i=0;i<S.length();i++)
            hashMap.put(S.charAt(i),hashMap.getOrDefault(S.charAt(i),0)+1);

        int output =0;
        for(Map.Entry<Character,Integer> entry: hashMap.entrySet())
            output += J.indexOf(entry.getKey())>=0?entry.getValue():0;



        System.out.println(output);
        System.out.println(hashMap);
    }
}
