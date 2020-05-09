package basicJava.stringprogramming;

import java.util.*;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String x = "teeter";
        char[] chars = x.toCharArray();
        String[] arr = x.split("");
        for(Character character : chars){
            System.out.println(character);
        }

/*        LinkedHashSet<String> strings = new LinkedHashSet<>();
        for(String s:arr){
            strings.add(s);
        }
        List<String> list = new ArrayList<>();
        list.addAll(strings);
        System.out.println(list);
        System.out.println("Non repeated char is !!");
        System.out.println(list.get(0));*/
        Map<Character, Integer> characterIntegerMap = new LinkedHashMap<>();
        for(Character c: chars) {
            if (characterIntegerMap.containsKey(c)){
                characterIntegerMap.put(c,characterIntegerMap.get(c)+1);
            }else{
                characterIntegerMap.put(c,1);
            }
        }
        System.out.println(characterIntegerMap);
        System.out.println("First non repeated character is:");
        for(Map.Entry<Character,Integer> ch :characterIntegerMap.entrySet()){
            if(ch.getValue() == 1){
                System.out.println(ch.getKey());
                break;
            }

        }
    }
}
