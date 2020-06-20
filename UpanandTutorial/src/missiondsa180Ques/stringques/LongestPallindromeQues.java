package missiondsa180Ques.stringques;

import java.util.HashMap;


public class LongestPallindromeQues {
    public static void main(String[] args) {
        String s = "\"babadada\"";
        HashMap<Character,Integer> hashMap = new HashMap<>();

        int length = 0;
        for(int i=0;i<s.length();i++){
            if(hashMap.containsKey(s.charAt(i))){
              //  System.out.println("previous oos "+hashMap.get(s.charAt(i))+"current pos "+s.charAt(i));
            boolean isPal =   pallindrome(s,hashMap.get(s.charAt(i)),i);
            if(isPal){

                length = Math.max(length,i-hashMap.get(s.charAt(i)));
            }

            }else{
                hashMap.put(s.charAt(i),i);

            }
        }
        length = length + 1;

        System.out.println("Length is "+length);

        StringBuilder output = new StringBuilder();
        char temp = s.charAt(0);
        int count = 0;

        for(int i=0;i<s.length();i++){
            int ind = i+length-1;
            System.out.println("ind is "+ind);

            if((s.charAt(i) == s.charAt(ind)) &&(pallindrome(s,i,ind)) ){
                while (length>count){
                    output.append( s.charAt(i+count));
                    count++;
                }
                break;
            }

        }

        System.out.println("My output is "+output.toString());




    }

    private static boolean pallindrome(String s, int integer, int i) {
        boolean isPal = false;
        String s1 = "";
        String s2 = "";
        for(int k = integer;k<=i;k++){
            s1 += s.charAt(k);
        }
        for(int k=i ;k>=integer;k--){
            s2 += s.charAt(k);
        }
        if(s1.equals(s2)){
            return true;
        }
        return isPal;
    }
}
