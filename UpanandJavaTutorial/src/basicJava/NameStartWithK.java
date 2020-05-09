package basicJava;

import java.util.function.Predicate;

public class NameStartWithK {
    public static void m1(String[] s, Predicate<String> p){
        for(String a:s){
            if(p.test(a)){
                System.out.println(a);
            }
        }

    }
    public static void main(String[] args) {
        String[] arr = {"kareena","katrina","virat","kohli","Urvasi"};
        Predicate<String> predicate = i->i.startsWith("k");
        m1(arr,predicate);
    }
}
