package missiondsa180Ques.math;

public class FactorialTrailingZeroes {
    public static void main(String[] args) {
        int n = 30;
        int result = factorial(n);
       System.out.println(result);

    }

    private static int factorial(int n) {
        long result = 1;
        while (n>1){
            result *= n;
            n--;
        }

        System.out.println("Factorial is "+result);
        String input = Long.toString(result);
        int output = 0;
        for(int i=input.length()-1;i>=0;i--){

            output++;
            if(input.charAt(i) != '0'){
                break;
            }

        }
        return output-1;

    }
}
