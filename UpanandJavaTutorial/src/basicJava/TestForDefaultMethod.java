package basicJava;

public class TestForDefaultMethod implements InterfaceDemo {
    @Override
    public void m1() {
        System.out.println("Overrided method");
    }

    public static void main(String[] args) {
        TestForDefaultMethod testForDefaultMethod = new TestForDefaultMethod();
        testForDefaultMethod.m1();
        InterfaceStatic.m1(4 );
    }
}
