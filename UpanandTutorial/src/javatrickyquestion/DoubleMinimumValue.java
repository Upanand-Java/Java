package javatrickyquestion;

import static java.lang.Float.NaN;

public class DoubleMinimumValue {
    public static void main(String[] args) {
        System.out.println(Math.min(Double.MIN_VALUE,0.0d));
        System.out.println(Double.MIN_VALUE);
        System.out.println(Math.min(Integer.MIN_VALUE,0));
        System.out.println(Math.min(Float.MIN_VALUE,0.0f));

        System.out.println(1.0/0);  //it will print infinity
        System.out.println(1.0/0.0); // it will also print infinity
        System.out.println(NaN);
    }
}
