package java8concept;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * Requirement:
 * I want to print the List of odd number
 * I want to add the each number in List by 5
 */
public class StreamWitFInterface {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(4);
        integers.add(5);
        integers.add(3);
        integers.add(2);
        integers.add(7);

        Predicate<Integer> predicate = (p)-> p%2 !=0 ;
        integers.stream().filter(predicate).forEach
                (it -> System.out.println(it));

        Function<Integer,Integer> function = (f)-> f+5;

        Consumer<Integer> consumer = (c)-> System.out.println(c);
        Supplier<String> exceptionSupplier = new Supplier<String>() {
            @Override
            public String get() {
                throw new RuntimeException();
            }
        };
        integers.stream().map(function).forEach(consumer);

    }
}
