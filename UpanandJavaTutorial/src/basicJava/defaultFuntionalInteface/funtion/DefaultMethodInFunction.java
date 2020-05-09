package basicJava.defaultFuntionalInteface.funtion;

import java.util.function.Function;

public class DefaultMethodInFunction {
    public static void main(String[] args) {
        Function<Integer,Integer> integerFunction = i -> i+i;
        Function<Integer,Integer> integerFunction1 = i->i*i*i;

       // integerFunction.apply(40);
       // integerFunction1.apply(2);

        System.out.println(integerFunction.andThen(integerFunction1).apply(2));
        System.out.println(integerFunction.compose(integerFunction1).apply(3));

    }
}
