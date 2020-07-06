package missiondsa180Ques.hastable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FrequencyAndIndex {
    public static void main(String[] args) {
        String s = "abccddss";
        HashMap<Character, List<Integer>> hashMap = new HashMap<>();

        for(int i=0;i<s.length();i++){
            List<Integer> list = new ArrayList<>();
            if(hashMap.containsKey(s.charAt(i))){
                list = hashMap.get(s.charAt(i));
                list.add(i);
                hashMap.put(s.charAt(i),list);


            }else {

                list.add(i);
                hashMap.put(s.charAt(i),list);

            }
        }
        System.out.println(hashMap);

    }
}
