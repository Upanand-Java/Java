package basicPractice;

public class StringPractice {
    public static void main(String[] args) {
        String s = "1";
        String s1 = "1";
        String s2 = new String("1");
        String s3 = s+s1+s2;
        System.out.println(s3);
        System.out.println(s==s1);
        System.out.println(s.equals(s1));
        System.out.println(s2==s1);

        String s4 = "ABC";
        String s5 = "CDE";
        String s6 = "FGH";
        String s7 = s4+s5+s6;
        System.out.println(s7);
        String a = s7.replace("A","");
        System.out.println(a);
    }
}
