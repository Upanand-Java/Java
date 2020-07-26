package missiondsa180Ques.stringques;

public class BalancedString {
    public static void main(String[] args) {
        String s ="RLRRLLRLR";
        int rCOunter = 0;
        int lcounter = 0;
        int totalBalnced = 0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'R'){
                rCOunter++;
            }else if(s.charAt(i)=='L')
            {
                lcounter++;
            }
            if(rCOunter == lcounter){
                totalBalnced++;
                rCOunter = 0;
                lcounter = 0;
            }

        }


        System.out.println(totalBalnced);
    }
}
