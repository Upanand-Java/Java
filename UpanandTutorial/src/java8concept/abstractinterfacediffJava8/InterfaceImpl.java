package java8concept.abstractinterfacediffJava8;

public class InterfaceImpl implements InterfaceJava8Feature {
    @Override
    public void m1() {

    }

    @Override
    public String m2(String name) {
        return null;
    }

    public static void main(String[] args) {
        InterfaceJava8Feature.m4("upannad");
       // m4("upanand"); - Not allowed static method in interface only invoked by Interface only
        InterfaceImpl anInterface = new InterfaceImpl();
      //  anInterface.m4("upanand"); - Not allowed
        //InterfaceImpl.m4("upanand"); - Not allowed
    }
}
