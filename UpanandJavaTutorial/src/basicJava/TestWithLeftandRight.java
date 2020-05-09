package basicJava;

public class TestWithLeftandRight implements InterfaceLeft,InterfaceRight{ //we will get error because of ambiguity that same signature of method in interface
    //we can overcome by overide this method or by use super keyword in overrided method.

    @Override
    public void m1() {
       // System.out.println("My Left method");
        InterfaceLeft.super.m1();
        InterfaceRight.super.m1();
    }

    @Override
    public void m11() {
        System.out.println("In m11");
    }

    public static void main(String[] args) {
        TestWithLeftandRight testWithLeftandRight = new TestWithLeftandRight();
        testWithLeftandRight.m1();

    }
}
