package missiondsa180Ques.stringques;

public class DecodeString {
    public static void main(String[] args) {
      //  Input: s = "3[a]2[bc]"
       // Output: "aaabcbc"
        String s = "3a2r1e1w1q3e1d2a";
         //     abcbcabcbcabcbc
        StringBuilder builder = new StringBuilder();
        int count = 0;
         for(int i=0;i<s.length();i=i+2){
             count = Integer.parseInt(String.valueOf(s.charAt(i)));
             while (0<count){
                 builder.append(s.charAt(i+1));
                 count--;
             }
         }
        System.out.println(builder.toString());
    }
}
