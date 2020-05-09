package basicPractice;

public class SwapWithoutTemp {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        System.out.println("Before swap a is "+a+", b is "+b);
        a = a+b; //a= 40
        b = a-b; //b=10
        a = a-b; //a= 30

        System.out.println("After swap a is "+a+", b is "+b);
    }
}
