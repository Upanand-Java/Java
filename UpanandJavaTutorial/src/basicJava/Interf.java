package basicJava;

@FunctionalInterface
public interface Interf {
    public void m1();
    //public void m4();
    default void m2(){
        System.out.println("hello");
    }
    public static void m3(){
        System.out.println("");
    }
}
