package basicGroovyCodePractice.valuelabs;

public class Anagrams {
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";

        isAnagram(s,t);

        /*StringBuilder builder = new StringBuilder(t);

        for(int i=0;i<s.length();i++){
            if(builder.indexOf(String.valueOf(s.charAt(i)))>=0 ){
                builder.deleteCharAt(builder.indexOf(String.valueOf(s.charAt(i))));

            }
        }
        System.out.println(builder.toString());
        if(builder.length()==0)
            System.out.println("true");
        else
            System.out.println("false");*/
    }

    public static boolean isAnagram(String s, String t) {
        int[] arr = new int[26];

        //System.out.println(arr[0]+"initialized");

        for(int i=0;i<s.length();i++){

            arr[s.charAt(i)-'a']++;
           // System.out.print(arr[s.charAt(i)-'a']+++" ,");
        }
        for(int i=0;i<t.length();i++){
            arr[t.charAt(i)-'a']--;
           // System.out.print(arr[t.charAt(i)-'a']--+" ,");
        }
        boolean is = true;
        for(int i:arr){
           // System.out.print(i+", ");
            if(i !=0) {
                is = false;
                break;
            }

        }
        //System.out.println(is);
        return is;
    }
}
