package basicPractice;

public class DepthInEquation {
    public static void main(String[] args) {
        String input = "(() ())";
        int result = getDepthOfEquation(input);
        System.out.println(result);
    }

    private static int getDepthOfEquation(String input) {
        int maxDepth = 0;
        int paranthesisPointer = 0;
        for(int i =0;i< input.length();i++){
            if(input.charAt(i) == '('){
                paranthesisPointer++;
            }else if(input.charAt(i)== ')'){
                paranthesisPointer --;
            }
            maxDepth = Math.max(paranthesisPointer , maxDepth);

        }
        return maxDepth;
    }
}
