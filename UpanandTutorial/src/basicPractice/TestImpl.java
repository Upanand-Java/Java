package basicPractice;

public class TestImpl implements Test {
    @Override
    public String am1() {
        return null;
    }

    @Override
    public String am2() {
        return null;
    }


    public static void main(String[] args) {
        TestImpl test = new TestImpl();
        System.out.println(test.m1());

        Test.sm1();

    }
}
