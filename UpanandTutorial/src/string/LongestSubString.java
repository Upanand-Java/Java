package string;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LongestSubString {
    public static void main(String[] args) {
        String x = "abcadaefagsnan";
        char[] arr = x.toCharArray();
        String result = "";
        int finalLength = 0;

        LinkedHashMap<Character,Integer> integerHashMap = new LinkedHashMap<>(x.length());

        for(int i=0;i<arr.length;i++){
           // char c = arr[i];

            if(!integerHashMap.containsKey(arr[i])){
                integerHashMap.put(arr[i],i);
            }else{
                i = integerHashMap.get(arr[i]);
                integerHashMap.clear();
            }

            if(integerHashMap.size()>finalLength){
                finalLength = integerHashMap.size();
                System.out.println("Map is "+integerHashMap);
                result = integerHashMap.keySet().toString();
            }

        }



        System.out.println("Result is "+result+" and length is  "+finalLength);
    }
}
