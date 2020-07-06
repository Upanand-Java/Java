package missiondsa180Ques.stringques;

public class LongestPallindrome {
    static int maxLength = 0;
    static int lowerIndex = 0;
    static String  input = "cbbd";

    public static void main(String[] args) {
        for(int i=0;i<input.length()-1;i++){
            streched(input,i,i); //streched for 1 middle odde length
            streched(input,i,i+1); //streched if middle is even i.e two middle
        }
        System.out.println("length is "+maxLength+"lowe"+lowerIndex);
        String result = input.substring(lowerIndex,lowerIndex+maxLength);
        System.out.println("Result is "+result);

    }

    private static void streched(String input, int low, int high) {
        while(high<input.length() && low>=0 && (input.charAt(low)==input.charAt(high))){
            low--;
            high++;

        }

        if(maxLength<high-low-1){
            maxLength = high-low-1;
            lowerIndex = low+1;
        }

    }
}
