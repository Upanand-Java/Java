package missiondsa180Ques.stringques;

import java.util.HashMap;

public class DeckOfCard {
    public static void main(String[] args) {
        String A = "TTT";
        String B = "99A";
        solution(A,B);
    }

    private static void solution(String A, String B) {
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('A',14);
        hm.put('K',13);
        hm.put('Q',12);
        hm.put('J',11);
        hm.put('T',10);
        hm.put('9',9);
        hm.put('8',8);
        hm.put('7',7);
        hm.put('6',6);
        hm.put('5',5);
        hm.put('4',4);
        hm.put('3',3);
        hm.put('2',2);
        int result = 0;
        for(int i=0;i<A.length();i++){
            System.out.println(A.charAt(i)+" "+B.charAt(i));
            if(hm.get(A.charAt(i))> hm.get(B.charAt(i))){
                result++;
            }
        }
        //return result;
        System.out.println(result);
    }
}
