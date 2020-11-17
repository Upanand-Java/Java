package mcq;

public class Sample {
    public static void main(String[] args) {
        int[] arr = {1,1};
        int[] a = arr;
       // System.out.println(myMethod(null));
        myMethod(null);
    }

    private static void myMethod(Object o) {
        System.out.println("In object method");
    }

    private static void myMethod(Number o) {
        System.out.println("In String method");
    }

    private static void myMethod(Integer o) {
        System.out.println("In Integer method");
    }


   /* private static void myMethod(StringBuffer stringBuffer) {
        System.out.println("In object method");
    }*/
}
