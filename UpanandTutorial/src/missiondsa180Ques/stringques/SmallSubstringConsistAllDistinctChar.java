package missiondsa180Ques.stringques;

import java.util.Arrays;
import java.util.HashMap;

public class SmallSubstringConsistAllDistinctChar {

    public static void main(String[] args) {
        String s = "hahbcdefghabbabcaaaadefghhf";

        HashMap<Character ,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        //int count  = 0;
        int Max = Integer.MAX_VALUE;
        int result = 0;
        String res ="";


        for(int i =0;i<s.length();i++){
            int[] arr = new int[256];
            Arrays.fill(arr,0);
          int  count = 0;
          StringBuilder builder = new StringBuilder();
            for(int j=i;j<s.length();j++){
                if(arr[s.charAt(j)]==0){
                    arr[s.charAt(j)] =1;
                    count++;
                }
                builder.append(s.charAt(j));
                if(count ==map.size())
                    break;

            }
            if( builder.length()< Max && count == map.size()){
                    res = builder.toString();
                    result = builder.length();
                    Max = result;
            }

        }

        System.out.println(result);
        System.out.println(res);

    }
}
