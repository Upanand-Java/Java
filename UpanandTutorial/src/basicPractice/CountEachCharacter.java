package basicPractice;

import java.util.HashMap;

public class CountEachCharacter {
    public static void main(String[] args) {
        final String a= "abcdefghiabcdefghi";
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = a.toCharArray();

        for(char c: chars){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1); // when we found that character just increment by 1

            }else{
                map.put(c,1); //first time if the map does not contain the letter

            }
        }
        System.out.println(map);

    }
}
