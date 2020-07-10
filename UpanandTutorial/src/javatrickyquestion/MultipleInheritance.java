package javatrickyquestion;

@FunctionalInterface
interface I1{
    default void m2(){
        System.out.println("in m2");
    }
    static void m3(){
        System.out.println("in static");
    }
   // void m2(){

    //}
    public abstract void m1();

}
interface I2{

}

interface I3{

}

 interface MultipleInheritanc extends I1,I2,I3 {
    @Override
    default void m2() {
        System.out.println("hey");
    }
}

public class MultipleInheritance implements MultipleInheritanc,I2,I1{

    @Override
    public void m1() {

    }

    public static void main(String[] args) {
        MultipleInheritanc e = new MultipleInheritance();
        e.m2();
        I1.m3();
    }
}