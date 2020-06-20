package missiondsa180Ques.math;

public class ExcelColoumn {
    public static void main(String[] args) {
        String input = "BA";

        int output = 0;

        for(int i=0;i<input.length();i++ ){

            output *= 26;

            output += (input.charAt(i)-'A')+1 ;
        }
        System.out.println(output);
    }
}
