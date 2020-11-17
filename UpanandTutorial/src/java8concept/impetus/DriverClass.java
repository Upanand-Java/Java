package java8concept.impetus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class DriverClass {
    public static void main(String[] args) {
        ArrayList<Laptop> list = new ArrayList<>();
        list.add(new Laptop(1001,"DELL"));
        list.add(new Laptop(15001,"Apple"));
        list.add(new Laptop(9001,"HP"));
        list.add(new Laptop(001,"HP"));

        Collections.sort(list, Comparator.comparingInt(e1-> e1.price));
       // list.stream().sorted(1);

        System.out.println(list);
    }
    Supplier<Double> supplier = ()->{
        double random = Math.random();
        return random;
    };

    Consumer<Integer> cons = (c)->{
        c= c+3;
        System.out.println(c);
    };
}
