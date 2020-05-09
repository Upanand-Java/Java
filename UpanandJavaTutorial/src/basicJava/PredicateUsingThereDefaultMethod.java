package basicJava;

import java.util.function.Predicate;

public class PredicateUsingThereDefaultMethod {
    public static void m1(int[] ints , Predicate<Integer> p){
        for(int x:ints){
            if(p.test(x)){
                System.out.println(x);
            }
        }

    }
    public static void main(String[] args) {
        int[] x = {0,12,11,23,12,1,3,1,33,14,21};
        Predicate<Integer> integerPredicate = i->i>10;
        Predicate<Integer> integerPredicate1 = i->i%2==0;
        m1(x,integerPredicate);
        m1(x,integerPredicate.negate());
        m1(x,integerPredicate.and(integerPredicate1));
        m1(x,integerPredicate.or(integerPredicate1));


    }
}
