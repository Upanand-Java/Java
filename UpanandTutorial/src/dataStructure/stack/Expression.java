package dataStructure.stack;

import java.util.Stack;

public class Expression {
    public static void main(String[] args) {
        String exp = "[(])";

        char[] element = exp.toCharArray();

       Stack<Character> characters = new Stack<Character>();

        for(int i=0;i<element.length;i++){
            if(element[i] == '[' || element[i] == '{' || element[i] =='(' ){
                characters.push(element[i]);
            }else if(element[i] == ']' || element[i] == '}' || element[i] ==')' ){
                if(isPair(characters.peek(),element[i])){
                    characters.pop();
                }
                else{

                    System.out.println("Not Balanced");
                    break;
                }
            }
        }if(characters.size()==0)
            System.out.println("Balanced");
    }

    private static boolean isPair(Character peek, char c) {

        if(peek=='[' && c ==']')
            return true;
        else if (peek=='{' && c =='}')
            return true;
        else if(peek=='(' && c ==')')
            return true;

        else
            return false;
    }
}
