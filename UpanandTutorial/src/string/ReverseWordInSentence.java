package string;

public class ReverseWordInSentence {
    public static void main(String[] args) {
        String s = "My name is upanand";
        //output should be
        //upanand is name my

        String[] strarr = s.split(" ");
        for(String x:strarr){
            System.out.println(x);
        }
        int index = strarr.length;
        System.out.println(index);
        String newString = "";
        while (index !=0){
            newString+=strarr[index-1];
            newString = newString+" ";
            index--;
        }
        System.out.println("New String is "+newString);


    }
}
