package missiondsa180Ques.stringques;

public class EncodingOnceagain {
    public static void main(String[] args) {
        String s = "aaarrewqeeedssaa";
        StringBuilder builder = new StringBuilder();
        char prev = s.charAt(0);
        int count =1;
        for(int i=1;i<s.length();i++){
            if(prev == s.charAt(i) )
            {
                count++;


            }else {
                builder.append(count).append(prev);
                prev = s.charAt(i);
                count = 1;
            }

        }
        builder.append(count).append(prev);
        System.out.println(builder.toString());
    }
}
