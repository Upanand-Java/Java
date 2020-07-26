package missiondsa180Ques.stringques;

public class swapWithoutUsingTemp {
    public static void main(String[] args) {
        String s1 = "upanand";
        String s2 = "verma";

        s2 = s1+s2; //upanandverma
        System.out.println(s1.length());
        s1 = s2.substring(s1.length());
        s2 = s2.substring(0,s2.length()-s1.length());


        System.out.println(s1);
        System.out.println(s2);
    }
}
