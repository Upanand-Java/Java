package missiondsa180Ques.hastable;

public class WordSentence {
    public static void main(String[] args) {
        String A = "this is my";
        String B = "how are you";


        String[] s1 = A.split(" ");
        String[] s2 =B.split(" ");
        int total = s1.length+s2.length;

        String[] str = new String[total];

        for(int j=0;j<s1.length;j++){
            str[j] = s1[j];
        }

        int k=0;
        for(int i = s1.length;i<total;i++){
            str[i] = s2[k];
            k++;
        }

        for(String a:str)
            System.out.print(a);
    }
}
