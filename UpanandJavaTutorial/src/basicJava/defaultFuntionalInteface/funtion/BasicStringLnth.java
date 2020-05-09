package basicJava.defaultFuntionalInteface.funtion;

import java.util.function.Function;

public class BasicStringLnth {
    public static void main(String[] args) {
        Function<String,Integer> function = s->s.length();
        System.out.println(function.apply("upanand"));
        //remove blank space
        Function<String,String> stringFunction = sf->sf.replaceAll(" ","");
        System.out.println(stringFunction.apply("Durga soft software hyderabad"));

        //count blank space
        Function<String , Integer> integerFunction = intun -> intun.length()-intun.replaceAll(" ","").length();
        System.out.println(integerFunction.apply("Durga soft software hyderabad"));
    }
}
