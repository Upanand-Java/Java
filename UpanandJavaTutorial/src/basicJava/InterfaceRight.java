package basicJava;

public interface InterfaceRight {
    default void m1(){
        System.out.println("Right method");
    }
}
