package oracle;

public class HundredTimeWIthoutLoopFunction {
    public static void main(String[] args) {
        String s1 = "upanand";
        String s3 = s1+s1+s1;
        String s10 =s3+s3+s3+s1;
        String s30 = s10+s10+s10;
        String s100 =s30+s30+s30+s10;
        System.out.print(s100);
    }
}
