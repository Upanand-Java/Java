package missiondsa180Ques.stringques;

import java.util.Collections;

public class DeleteRecursively {
    public static void main(String[] args) {
        String input = "fghhhggfbbb";




        StringBuilder sb = new StringBuilder(input);
        int i=0;
        while( sb.length()-1>i){
            if(sb.charAt(i)==sb.charAt(i+1)){
                int temp =i+1;
                    while( temp<sb.length() && sb.charAt(i)==sb.charAt(temp)){
                        temp++;
                    }
                sb.delete(i,temp);
                    i = 0;
            }else{
                i++;

            }

           // Collections.sort();


        }
        System.out.println(sb.toString());
        System.out.println(sb.length()==0);

    }
}
