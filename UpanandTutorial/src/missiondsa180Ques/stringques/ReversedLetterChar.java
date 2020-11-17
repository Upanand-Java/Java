package missiondsa180Ques.stringques;

import java.util.Scanner;

public class ReversedLetterChar {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
       // System.out.println("Enter the length!");
        //int length = scanner.nextInt();
        //System.out.println("Enter the string !!");

        //String input = scanner.next();
        //sb.append(input);

        String x = "My name is upanand";
        StringBuilder s = new StringBuilder(x);
       // s.append("222");
        s.reverse();
        System.out.println(s);


        System.out.println(sb.toString());
    }
}
