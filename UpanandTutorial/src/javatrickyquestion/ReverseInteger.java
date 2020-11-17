package javatrickyquestion;

public class ReverseInteger {
    public static void main(String[] args) {
        int a = 123454214;
        reverseInteger(a);
    }

    private static void reverseInteger(int a) {
        int reversed = 0;
        while(a !=0){
            int digit = a%10;
            reversed = reversed*10+digit;
            a /= 10;
        }

        System.out.println(reversed);

    }
}
