package missiondsa180Ques.hastable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Keyboard {
    public static void main(String[] args) {
        String[] words = {"alaska" ,"DAd","opm"} ;

        HashMap<Integer ,String> hm = new HashMap<>();

        hm.put(1,"QWERTYUIOP");
        hm.put(2,"ASDFGHJKL");
        hm.put(3,"ZXCVBNM");
        ArrayList<String> strings = new ArrayList<>();

        String[] arr = new String[words.length];
        int j=0;
        int k =0;

        for(String s: words){
            for(Integer i: hm.keySet()){

                if(hm.get(i).contains(String.valueOf(s.charAt(0)).toUpperCase())){
                     k =1;
                    while(k<s.length() && hm.get(i).contains(String.valueOf(s.charAt(k)).toUpperCase())){
                        k++;
                    }
                }


            }
            if(s.length() == k){
                strings.add(s);
            }


        }
        for (String o: strings.toArray(new String[strings.size()])){
            System.out.print(o+",");
        }
    }
}
