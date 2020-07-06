package missiondsa180Ques.stringques;

import java.util.Stack;

public class ReverseWordStack {
    public static void main(String[] args) {


        String s = "My Name is Upanand";
        Stack<Character> characters = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = s.length()-1;i>=0;i--){
            if(s.charAt(i) != ' '){
                characters.push(s.charAt(i));
            }else if(s.charAt(i) == ' '){
                while (!characters.empty()){
                    stringBuilder.append(characters.peek());

                    characters.pop();

                }
                stringBuilder.append(" ");
            }




        }

        while (!characters.empty()){
            stringBuilder.append(characters.peek());
            characters.pop();
        }

        System.out.println(stringBuilder.toString());
    }
}