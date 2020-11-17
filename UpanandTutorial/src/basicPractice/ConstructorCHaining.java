package basicPractice;

import java.io.Serializable;

public class ConstructorCHaining implements Serializable {
    /*private class innerclass{
       // static int a = 10; // Inner class cannot static member

    }*/

   /* public ConstructorCHaining(){}

    public ConstructorCHaining(String message) {
       // super(message);
    }*/

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("upabna");
        System.out.println(stringBuilder.deleteCharAt(1).toString());

        String s1 = new String("java");
        String s2 = new String("java").intern();
        String s3 = "java";

        String s = "123455absd4322";
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<s.length();i++){
            int temp = (int)s.charAt(i);
           // System.out.println(temp);
            if((temp>= 97 && temp<=122))
                continue;
            else
                sb.append(s.charAt(i));

        }
        System.out.println(sb.toString());

    }



}
