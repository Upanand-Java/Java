package dataStructure.array;

import java.util.Stack;

public class ReverseSentence {
    public static void main(String[] args) {
       String x = "My name is upanand";
        frequency(x);
    }

    private static void frequency(String sen) {
        String outPutString = "";
        Stack<Character> characters = new Stack<>();
        for(int i=sen.length()-1;i>=0;i--){
            if(sen.charAt(i)== ' '){
                while(!characters.empty()) {
                    outPutString += characters.peek();
                    characters.pop();
                }
                outPutString = outPutString.concat(" ");
            }else {
                characters.push(sen.charAt(i));
            }
        }
        while(!characters.empty()) {
            outPutString += characters.peek();
            characters.pop();
        }

        System.out.println(outPutString);

    }
}
