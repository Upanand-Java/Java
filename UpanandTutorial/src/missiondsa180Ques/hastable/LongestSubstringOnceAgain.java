package missiondsa180Ques.hastable;

import java.util.HashMap;

public class LongestSubstringOnceAgain {

    public static void main(String[] args) {
        String s ="abcdefsfresabafdrsbjgfsgdywdydfwdvwwuw";

        HashMap<Character,Integer> integerHashMap = new HashMap<>();

        int length = 0;

        for(int i=0;i<s.length();i++){
            if(integerHashMap.containsKey(s.charAt(i))) {
                if (integerHashMap.size() > length) {
                    length = integerHashMap.size();
                    System.out.println(integerHashMap);
                    integerHashMap.clear();
                }
            }else {
                    integerHashMap.put(s.charAt(i),i);
                }

            }
        System.out.println(length);
        }


    }

