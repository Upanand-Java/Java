package basicJava;

import java.util.Scanner;
import java.util.function.Predicate;

public class AuthenticateUser {
    public static void main(String[] args) {
        Predicate<User> userPredicate = u-> u.username.equalsIgnoreCase("upanand") && u.password.equalsIgnoreCase("virat");
       // User user = new User("Upanand","virat");
       // User user1 = new User("jijij","jijj");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the username");
        String username = scanner.next();
        System.out.println("Enter the password");
        String password = scanner.next();
        User user = new User(username,password);
        System.out.println(user);
        if(userPredicate.test(user)){
            System.out.println("AUthenticate successful!!");

        }else {
            System.out.println("Invalid username and password!!");
        }



    }
}
