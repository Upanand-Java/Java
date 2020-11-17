package missiondsa180Ques.stringques;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

/**
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 */
public class RomanToInteger {
    public static void main(String[] args) {
        String input = "ICXIV";
        int output = convertToRoman(input);
        System.out.println(output);
    }

    /**
     * TIME - O(n) N IS LENGTH OF sTRING
     * sPACE 0(S) - S IS LENGTH OF STRING
     * @param input
     * @return
     */
    private static int convertToRoman(String input)  {
        int result = 0;
        int[] nums = new int[input.length()];
        for(int i =0;i<input.length();i++){
            switch (input.charAt(i)){
                case 'I':nums[i] =1;
                break;
                case 'V':nums[i] = 5;
                break;
                case 'X': nums[i] =10;
                break;
                case 'C':nums[i] =100;
                break;
                case 'L':nums[i] =50;
                    break;

                case 'D':nums[i] =500;
                    break;
                case 'M':nums[i] =1000;
                    break;

            }

        }
        System.out.println(Arrays.toString(nums));
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                result -= nums[i];
            }else {
                result += nums[i];
            }
        }
        return result+ nums[nums.length-1];
        //try(FileInputStream f = new FileInputStream("ttt")){
          //  System.out.println("t");
        //}
    }
}
