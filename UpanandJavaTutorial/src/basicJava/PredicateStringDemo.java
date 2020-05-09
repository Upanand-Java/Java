package basicJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class PredicateStringDemo {
    public static void main(String[] args) {
      Predicate<String> predicate = (s)->s.length()>5;
        System.out.println(predicate.test("upanand"));

        Predicate<Collection> collectionsPredicate = i->i.isEmpty();
        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(2);
        System.out.println(collectionsPredicate.test(integers));
    }
}
