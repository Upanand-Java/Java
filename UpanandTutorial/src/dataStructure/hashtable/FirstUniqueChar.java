package dataStructure.hashtable;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueChar {
    public static void main(String[] args) {
        String s= "loveleetcode";
        int n = s.length();

        HashMap<Character,Integer> integerHashMap = new HashMap<>(s.length());

        for(int i=0;i<n;i++){
            Character character = s.charAt(i);
            integerHashMap.put(character,integerHashMap.getOrDefault(character,-1)+1);
        }
        System.out.println(integerHashMap);

        for(int i=0;i<n;i++){
            if(integerHashMap.get(s.charAt(i))==0){
                System.out.println(i);
                break;
            }
        }

        /*String[] strArr = s.split("");

        LinkedHashMap<String , Integer> hashMap = new LinkedHashMap<>();
        //HashMap<String , Integer> hashMap = new HashMap<>();

        for(String i: strArr){
           // if(hashMap.containsKey(i)){
                hashMap.put(i,hashMap.getOrDefault(i,0)+1);
            }*//*else {
                hashMap.put(i, 0);
            }*//*


        System.out.println(hashMap);
        String a = "";
        for(Map.Entry<String,Integer> entry: hashMap.entrySet()){
            if(entry.getValue()==1){
               // System.out.println(entry.getKey());
                a = entry.getKey();
                break;
            }
        }

        for(int i=0;i<strArr.length;i++){
            if(strArr[i].equals(a)){
                System.out.println(i);
                break;
            }
        }*/
    }
}
