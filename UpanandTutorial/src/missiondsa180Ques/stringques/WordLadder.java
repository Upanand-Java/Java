package missiondsa180Ques.stringques;

public class WordLadder {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flo"};
        String res = longestCommonPrefix(strs);
        System.out.println(res);
    }

    /**
     * Time complexity would be O(S) where s is sum of all character in all string.
     * worst case all string are of same length and same character
     * space complexity would be 0(1).
     * @param strs
     * @return
     */
    private static String longestCommonPrefix(String[] strs) {
        String res = strs[0];
        System.out.println(strs[1].indexOf(res));
        for(int i=1;i<res.length();i++) {
            while(strs[i].indexOf(res)!=0){
                res = res.substring(0 , res.length()-1);
                if(res.isEmpty())
                    return "";

            }

        }


        return res;
    }

    private static String  getPrefix(String[] input){
        String first = input[0];
        for(int i=0;i<input.length;i++){
            while (input[i].indexOf(first) !=0){
                first = first.substring(0,first.length()-1);
                if(first.length()==0){
                    return "";
                }
            }
        }
        return first;
    }
}
