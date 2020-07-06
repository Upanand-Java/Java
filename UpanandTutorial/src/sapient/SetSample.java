package sapient;

import java.util.HashSet;

public class SetSample {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add("lenna");
        strings.add("Lenna");

        System.out.println(strings);
        try {
            int c = 1/0;

        } catch (ArithmeticException e) {
            System.out.println("E ");
            e.printStackTrace();
        } finally {
            System.out.println("F");
        }
    }
}
