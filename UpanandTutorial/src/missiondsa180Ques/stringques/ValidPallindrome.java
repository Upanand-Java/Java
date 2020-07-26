package missiondsa180Ques.stringques;

public class ValidPallindrome {
    public static void main(String[] args) {
        String s = "A";
        StringBuilder builder = new StringBuilder("");

        String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        System.out.println(actual);
        for(int i=0;i<s.length();i++){
           // if(String.valueOf(s.charAt(i)).matches("^[a-zA-Z0-9]*$")){
            if((s.charAt(i)>= 'A' && s.charAt(i)<='Z') || (s.charAt(i)>= 'a' && s.charAt(i)<='z')
            ||( s.charAt(i)>='0' && s.charAt(i)<='9')){
                builder.append(s.charAt(i));
            }

        }
        String y = builder.toString();
       // System.out.println(y);
       // String x = builder.reverse().toString();

        int i=0;
        for(int j=y.length()-1;j>=0;j--)
        {
            if(String.valueOf(y.charAt(i)).equalsIgnoreCase(String.valueOf(y.charAt(j) ))){
                i++;
                continue;

            }else{
                System.out.println(false);
                break;
            }
        }



        //System.out.println(x);

        //System.out.println(y.equalsIgnoreCase(x));


    }
}














