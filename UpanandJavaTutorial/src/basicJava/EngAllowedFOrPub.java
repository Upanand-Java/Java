package basicJava;

import java.util.Scanner;
import java.util.function.Predicate;

public class EngAllowedFOrPub {
    public static void main(String[] args) {
        Predicate<SoftwareEngineer> softwareEngineerPredicate = s-> s.name !=null && s.name.length()>2 && s.age>=18 && s.isHavingGf == true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name !!");
        String name = scanner.next();
        System.out.println("Enter the age");
        int age = scanner.nextInt();
        System.out.println("having gf?");
        boolean isGf = scanner.hasNext("Yes");
        System.out.println("isgf "+isGf);
        SoftwareEngineer softwareEngineer = new SoftwareEngineer(name,age,isGf);
        System.out.println(softwareEngineer);
        if(softwareEngineerPredicate.test(softwareEngineer)){
            System.out.println("ALlowed in pub");
        }else{
            System.out.println("Not allowed !!");
        }
    }
}
