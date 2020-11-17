package basicPractice;

public class ValueLabs {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("upanand");
        //StringBuffer buffer1 = new StringBuffer("upanand");
        StringBuffer buffer1 = buffer;
        System.out.println(buffer.equals(buffer1));
        System.out.println(buffer == buffer1);

        String s = new String("upanand");
        String s1 = new String("upanand");

        System.out.println(s.equals(s1));
        System.out.println(s == s1);

        String s2 = "upanand";
        String s3 = "upanand";

        System.out.println(s2.equals(s3));
        System.out.println(s2 == s3);


    }
}
