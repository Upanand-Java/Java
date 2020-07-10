package missiondsa180Ques.hastable;

import java.util.*;

public class NextWarmerTemperature {
    public static void main(String[] args) {
        int[] T = {73, 74, 75,73, 71, 69, 72,78, 76,74, 73};
        List<Integer> list = new ArrayList<>();
      // list =  Arrays.asList(T);
       // System.out.println();

        int temp = 0;
        int n= T.length;

        for(int i=0;i<T.length;i++){
            int num = T[i];
            temp =i+1;
            while(temp<n){
                if(T[i]<T[temp]){
                    T[i] = temp-i;
                    break;
                }

                temp++;
            }
            if (T[i] == num){
                T[i]=0;
            }

        }

       for(int i:T){
           System.out.print(i+",");
       }



    }
}
