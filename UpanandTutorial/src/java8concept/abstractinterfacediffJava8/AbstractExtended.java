package java8concept.abstractinterfacediffJava8;

public class AbstractExtended extends AbstractClass {
    @Override
    public void m1() {

    }

    @Override
    public String m2(String name) {
        return null;
    }

    @Override
    public String concreteMethod(String name){
        return name+name;
    }

    public static void main(String[] args) {
        AbstractExtended abstractExtended = new AbstractExtended();
        abstractExtended.m1();
        System.out.println();
    }
}
