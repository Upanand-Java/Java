package missiondsa180Ques.stack;

import java.util.Stack;

public class BalancedParanthesis {
    public static void main(String[] args) {
        String s= "){";
        boolean result = isValidStatement(s);
        System.out.println("Result is "+result);
    }

    private static boolean isValidStatement(String s) {
        boolean isValid = false;
        if(s.length()%2 !=0)
            return isValid;

        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{' || s.charAt(i) == '[' || s.charAt(i) == '('){
                stack.push(s.charAt(i));
            }else if((s.charAt(i)=='}' || s.charAt(i) == ']' || s.charAt(i) == ')')&& stack.size()>0){
                if(isbal(stack.peek(),s.charAt(i))){
                    stack.pop();

                }else {
                    isValid = false;
                    break;
                }
            }
        }

        if(stack.size() == 0){
            isValid = true;
        }







        return isValid;
    }

    private static boolean isbal(Character peek, char charAt) {
        if(peek=='[' && charAt == ']'){
            return true;
        }else if(peek=='{' && charAt == '}'){
            return true;
        }else if(peek=='(' && charAt == ')'){
            return true;
        }
        return false;
    }
}
