package missiondsa180Ques.hastable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "pwwkewabcdabc";

        HashMap<Character,Integer> characters = new HashMap<>();
        int maxlength = 0;

        int x = 0;

        for(int i=0;i<s.length();i++){
            if(characters.containsKey(s.charAt(i))){

                i = characters.get(s.charAt(i));
               // x =i+1;

                characters.clear();



            }else {

                characters.put(s.charAt(i),i);
            }


            if(characters.size()>maxlength) {
               // x = i;
               maxlength = characters.size();
           }
        }



        //  System.out.println("Max length "+maxlength+" "+forStr);

         // String result = s.substring(forStr,forStr+maxlength);

        System.out.println(maxlength+"i ");


    }
}
