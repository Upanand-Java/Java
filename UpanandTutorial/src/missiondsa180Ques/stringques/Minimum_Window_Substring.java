package missiondsa180Ques.stringques;

import java.util.Arrays;
import java.util.HashMap;

public class Minimum_Window_Substring {
    public static void main(String[] args) {
        String s = "ADOBECODECBANC";
        String t = "ABC"; //BANC


        HashMap<Character , Integer> map = new HashMap<>();

        for(int i=0;i<t.length();i++)
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);

        int min_len = Integer.MAX_VALUE;
        String result = "";
        for(int i=0;i<s.length();i++){
            int[] visited = new int[256];
            Arrays.fill(visited,0);
            int count = 0;
            StringBuilder builder = new StringBuilder();
            for(int j=i;j<s.length();j++){
                for(Character c: map.keySet()){
                    if(s.charAt(j)== c && visited[s.charAt(j)]==0){
                        count++;
                        visited[s.charAt(j)] =1;
                    }
                }
                builder.append(s.charAt(j));
                if(count == map.size())
                    break;
            }
            if(builder.length()<min_len && count== map.size()){
                result = builder.toString();

                min_len = builder.length();
            }
        }
        System.out.println(result);
    }
}
