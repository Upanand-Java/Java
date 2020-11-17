package missiondsa180Ques.stringques;

public class ReverseStringReqursion {
    public static void main(String[] args) {
        String x = rev1("INDIA hnunu");
        System.out.println(x);
    }

    private static String rev(String india) {
            if(india.length() == 1)
                return india;
            else
                return india.substring(india.length()-1)+rev(india.substring(0,india.length()-1));


    }
    private static String revStr(String s)

    {
        if(s.length()==1)
            return s;
        else
            return s.substring(s.length()-1)+revStr(s.substring(0,s.length()-1));



    }

    public static String rev1(String input){

        if(input.length() == 1)
            return input;
        return input.charAt(input.length()-1)+rev1(input.substring(0,input.length()-1));

    }
}
