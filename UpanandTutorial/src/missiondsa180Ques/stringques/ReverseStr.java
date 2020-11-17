package missiondsa180Ques.stringques;

public class ReverseStr {
    public static void main(String[] args) {

        String s = "abcdefg";
        int k = 2;
        StringBuilder sb = new StringBuilder();


        int i=0;
        while(i<s.length()){
            int n =k;
            System.out.println(sb.toString());

            while(i<s.length() && n>0 )

            {
                System.out.println(s.charAt(n-i-1));
                sb.append(s.charAt(n-i-1));
                i++;
                n--;

            }
            // j=0;
            n=k;
          //  i=k+i;
            while(i<s.length() && n>0 )
            {
                sb.append(s.charAt(i));
                i++;
                n--;

            }
        }

       // return sb.toString();
        System.out.println(sb.toString());
    }
}
