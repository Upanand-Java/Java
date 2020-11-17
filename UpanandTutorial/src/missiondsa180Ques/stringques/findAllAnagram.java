package missiondsa180Ques.stringques;

import basicGroovyCodePractice.valuelabs.Anagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class findAllAnagram {
    public static void main(String[] args) {
        String s  = "cbaebacbacdabca"; //0,4,5,6,7
        String t = "abc";
        List<Integer> list = new ArrayList<>();
        HashMap<Character , Integer> hashMap = new HashMap<>();

        /*for(int i=0;i<t.length();i++)
            hashMap.put(t.charAt(i),hashMap.getOrDefault(t.charAt(i),0)+1);
        int counter = hashMap.size();*/
        /*for(int i =0;i<s.length();i++){
            if(hashMap.containsKey(s.charAt(i))) {
                    hashMap.put(s.charAt(i),hashMap.get(s.charAt(i))-1);
                    if(hashMap.get(s.charAt(i))==0){
                        counter --;
                }
            }
                if(counter == 0) {
                    list.add(i-t.length()+1);
                    counter = hashMap.size();
                    for(int j=0;j<t.length();j++)
                        hashMap.put(t.charAt(j),hashMap.getOrDefault(t.charAt(j),0)+1);

                  //  i = i-t.length()+2;
                    //System.out.println(i);
                }
        }*/
        for(int i=0;i<(s.length()-t.length()+1);i++){
         boolean x  =   Anagrams.isAnagram(s.substring(i,i+t.length()),t);
         if(x)
             list.add(i);

        }

        System.out.println(list);

    }
}
