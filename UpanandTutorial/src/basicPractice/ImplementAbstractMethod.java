package basicPractice;

public class ImplementAbstractMethod {
    public static void main(String[] args) {


        AbstractClass abstractClass = new AbstractClass() {
            @Override
            public void m2() {
                super.m2();
            }
        };

        abstractClass.m2();


    }
}
