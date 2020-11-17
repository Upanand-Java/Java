package missiondsa180Ques.stringques;

import java.util.Arrays;

public class ReverseIndividually {
    public static void main(String[] args) {
        String s = "this is a tree";
        String res = revIndividual(s);
        System.out.println(res);
    }

    private static String revIndividual(String s) {
        String[] str = s.split(" ");

        for(int i=0;i<str.length;i++){
            str[i] = rev(str[i]);
        }
        StringBuilder sb = new StringBuilder();
        for(String i:str){
            sb.append(i);
            sb.append(" ");
        }
        return sb.substring(0,sb.length()-1).toString();
    }

    private static String rev(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
