package missiondsa180Ques.hastable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "pwwkew";

        HashSet<Character> characters = new HashSet<>();
        int maxlength = 0;
        int startIndex = 0;


        for(int i=0;i<s.length();i++){
            if(characters.contains(s.charAt(i))){

                int diff = i-startIndex;
                if(diff>maxlength){
                    maxlength =diff;
                }
                characters.clear();
                characters.add(s.charAt(i));
                startIndex =i;

            }else {

                characters.add(s.charAt(i));
            }
        }

          if(maxlength==0)
              maxlength = s.length();

          System.out.println("Max length "+maxlength);


    }
}
