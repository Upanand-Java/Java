package basicJava.streamApi;

import basicJava.Interf;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ForEachMethodDemo {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Upanand");
        strings.add("VIrat");
        strings.add("kohli");

        Consumer<String> stringConsumer = s -> System.out.println(s);
        Consumer<Integer> integerConsumer = s -> System.out.println(s);

        strings.stream().forEach(stringConsumer);

        String[] strArray = strings.stream().toArray(String[]:: new);
        for(String s:strArray){
            System.out.println(s);
        }
        //we can also create stream of group of object and array !!
        Stream<Integer> stream = Stream.of(9,22,11,22,33,44,44,42,33,2,4,22,44,32,4,4,3,4,5,666,54);
        stream.forEach(integerConsumer);

        Double[] d = {6.1,5.56,8.8};
        Stream<Double> doubleStream = Stream.of(d);
        doubleStream.forEach(i-> System.out.println(i));
    }
}
