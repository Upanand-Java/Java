package sapient;

import java.io.IOException;

class A {
    public A() {
        System.out.print("A");
    }

    public void m1(String x)  throws ArithmeticException{
        System.out.println("In m1 x y"+x);
    }

    public String m1Loaded(String x)  {
        System.out.println("In m1 x y"+x);
        return x;
    }
}

class B extends A {
    public B() {
        super();
        System.out.print("B");
        //super();
    }
    @Override
    public void m1(String x) throws NullPointerException{
        System.out.println("In m1 child class x"+x);
    }

    public void m1Loaded(String x,String y) throws Throwable {
        System.out.println("In m1 x y"+x+""+y);
    }
}

public class Try {
    public static void main(String[] args) throws Throwable {
        //Integer a = null;
        //Integer a = null;
        //String a = null;
        //String b = a;
        //System.out.println(b);

     A a = new B();
     a.m1("");
     a.m1Loaded("");
    }
}
