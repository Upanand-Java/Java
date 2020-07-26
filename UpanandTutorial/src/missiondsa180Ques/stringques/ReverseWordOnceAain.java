package missiondsa180Ques.stringques;

import java.util.Stack;

public class ReverseWordOnceAain {
    public static void main(String[] args) {
        String a = "I am hero";
        Stack<Character> stack = new Stack<>();
        StringBuilder builder = new StringBuilder();

        for(int i=a.length()-1;i>=0;i--){
            if(a.charAt(i) != ' '){
                stack.push(a.charAt(i));
            }else if(a.charAt(i)== ' '){
                while ( !stack.empty()){
                    builder.append(stack.peek());
                    stack.pop();
            }
                builder.append(" ");

            }


        }
        while (!stack.empty()){
            builder.append(stack.peek()) ;
            stack.pop();
        }
        System.out.println(builder.toString());
    }
}
