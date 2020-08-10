package java8concept;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamConvertStringtoInt {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1234");
        list.add("23433");
        list.add("55445");

        Function<String , Integer> function = (i)->{
          return   Integer.parseInt(i);
        };

       // Predicate<String> pr = p-> Integer.parseInt(p)%2 !=0;

        Supplier<Double> supplier = () -> Math.random();

        Consumer<String> consumer = j -> {
            int i = Integer.parseInt(j);

            System.out.println(i);
        };


        Consumer<String> stringConsumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };


        String[] str = {"123","444","66"};
        Stream sr = Stream.of(str);
        sr.forEach(System.out::println);
       // Stream.of(str).map(function).forEach(i-> System.out.println(i));
       // Stream.of(list).map(i -> i.add("huuhu")).forEach(i-> System.out.println(i));

       list.stream().map(k->Integer.parseInt(k+2)).filter(i-> i%2==0).forEach( System.out::println);

       // Stream.of(list).forEach(s -> System.out.println(s.get(0)) );

        long c = list.stream().filter(i-> Integer.parseInt(i)>12345).count();

                Stream.of(str).min((o1,o2)-> Integer.parseInt(o1)>Integer.parseInt(o2)
                        ?1:Integer.parseInt(o2)<Integer.parseInt(o1)?-1:0).orElse("0");

        System.out.println(c);




    }
}
