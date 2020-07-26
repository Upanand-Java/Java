package sapient;


import designpattern.adaptor.Charger;

public class TestClass {
        public static void main(String[] args) {
            Test test = new Test();
           // test.m1(5);;
           // Object o = null;
            test.m1(null);

        }
        public static class Test {
            public void m1(Integer o){
                System.out.println("in Intger");
            }
            public void m1(Object o){
                System.out.println("in Object");
            }
            public void m1(Number c){
                System.out.println("in Number");
            }



    }
}
