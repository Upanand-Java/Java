package missiondsa180Ques.stringques;

import java.util.LinkedHashSet;

public class removeDupAdjacent {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String S = "dabbadccabcdefghijhhk";
        char[] str = S.toCharArray();

        int j =0;

        for(int i =0;i< str.length;i++){
            str[j] = str[i];
            if(j>0 && (str[j-1] == str[j])){
                j -= 2;
            }
            j++;
        }
        String a = new String(str,0,j);
        System.out.println(a);
        /*sb.append(S);

        LinkedHashSet<Character> characters = new LinkedHashSet<>();
        //int i = 1;
        characters.add(sb.charAt(0));

        for(int i=1;i<sb.length();i++){
            if(characters.contains(sb.charAt(i))){
                if(sb.charAt(i)== sb.charAt(i-1)){
                    characters.remove(sb.charAt(i-1));
                    sb.delete(i-1,i+1);
                    System.out.println(sb.toString());
                    //sb.deleteCharAt(i);
                    i=i-2;
                    System.out.println(i+" val"+characters);
                }


            }else {
                characters.add(sb.charAt(i));
            }
           // i++;



        }
        System.out.println("Res is "+sb.toString());
        System.out.println(characters);*/
    }
}
