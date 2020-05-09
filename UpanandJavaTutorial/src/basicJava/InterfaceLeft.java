package basicJava;

@FunctionalInterface
public interface InterfaceLeft {
    public void m11(); //abstract method.
    default void m1(){
        System.out.println("Left method");
    }
}
