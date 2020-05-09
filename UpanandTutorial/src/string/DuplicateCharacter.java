package string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DuplicateCharacter {
    public static void main(String[] args) {
        String x = "mamdamemmqwkrghsjinfneifn";
        char[] chars = x.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
       // HashMap<Character,Integer> duplicateKey = new HashMap<>();
        HashSet<Character> dupChar = new HashSet<>();
       // int index = 0;
        for(int i=0;i<=chars.length-1;i++){
            if(map.containsKey(chars[i])){
               map.put(chars[i],map.get(chars[i])+1);
                dupChar.add(chars[i]);
            }else{
                map.put(chars[i],1);
            }
        }
        System.out.println("Duplicate key is "+dupChar);
        System.out.println(map);
        System.out.println("That character which is duplicate in string is:");
        for(Map.Entry<Character,Integer> characterIntegerEntry: map.entrySet()){
            if(characterIntegerEntry.getValue()>1){
                System.out.println(characterIntegerEntry.getKey());
            }

        }
    }
}
