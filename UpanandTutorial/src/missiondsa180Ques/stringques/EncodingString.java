package missiondsa180Ques.stringques;

import java.util.HashMap;

public class EncodingString {
    public static void main(String[] args) {
        String s = "aaarrewqeeedssaa";
        HashMap<Character,Integer> hashMap = new HashMap<>();
        StringBuilder builder = new StringBuilder();

        char [] chararr = s.toCharArray();
        int count = 0;
        char prevChar =chararr[0];

//aaaabbbccd
        //4a2b1h1b3c1a1d1c
        for(char c : chararr){
            if(c == prevChar){
                count++;
            }else {
                builder.append(count).append(prevChar);
                prevChar = c;
                count = 1;
            }

        }
        builder.append(count).append(prevChar);
        System.out.println(builder.toString());
    //aaaabbbcsdd
        StringBuilder builder1 = new StringBuilder();

        char previous = chararr[0];
        hashMap.put(previous,0);
        for(char c: chararr){
            if(hashMap.containsKey(c)){
              hashMap.put(c,hashMap.get(c)+1);
            }else{
                builder1.append(hashMap.get(previous)).append(previous);
                previous = c;
                hashMap.clear();

                hashMap.put(c,1);
            }
        }

        builder1.append(hashMap.get(previous)).append(previous);
        System.out.println(builder1.toString());





      //  for( int i=0;i<s.length();)
    }
}
