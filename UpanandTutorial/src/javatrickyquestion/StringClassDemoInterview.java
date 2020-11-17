package javatrickyquestion;

public class StringClassDemoInterview {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("abs");
        System.out.println(builder.hashCode());

       builder= builder.append("gftftf");

        System.out.println(builder.hashCode());





        String x = "upanand";
        System.out.println(x.hashCode());

       x= x.substring(2);
        System.out.println(x.hashCode());

        System.out.println(x);

    }
}
