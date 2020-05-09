package basicJava.defaultFuntionalInteface.funtion;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class UserAuthentication {
    public static void main(String[] args) {
        System.out.println("Enter the username !!");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Enter the password");
        String password = scanner.next();
        Function<String,String> stringFunction = s->s.substring(0,5);//last one is excluded always considered first five character
        Function<String,String> stringFunction1 = s-> s.toLowerCase();

        Predicate<String> predicate = s-> s.equals("durga");
        Predicate<String> stringPredicate = s-> s.equals("java");

        String usernameUpdated = stringFunction.andThen(stringFunction1).apply(name);
        if(predicate.test(usernameUpdated) && stringPredicate.test(password)){
            System.out.println("Authentication successfull!!");
        }
        else{
            System.out.println("F O");
        }

        Function<String,String> stringFunction2 = Function.identity();
        System.out.println(stringFunction2.apply(name));

    }
}
