package basicJava;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {


        Predicate<Integer> predicate = i -> i > 20;
        System.out.println(predicate.test(2));
    }

}
