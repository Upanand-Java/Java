package string;

public class StringImmutable {
    public static void main(String[] args) {
        String s = new String("Java");
        s.concat("Python");
        s = s.concat("PHP");
        System.out.println(s);

    }
}
