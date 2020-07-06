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
            public void m1(String o){
                System.out.println("in obj");
            }


            public void m1(int c){
                System.out.println("in String");
            }



    }
}
