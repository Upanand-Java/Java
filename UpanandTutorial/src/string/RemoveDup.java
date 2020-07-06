package string;

import java.util.Arrays;

public class RemoveDup {
    public static void main(String[] args) {
        String input = "abbbccdeefghfab";
        String outputSort = sortingMethod(input);
        System.out.println("res "+outputSort);
        String outputIndexOf = indexOfMethod(input);
        System.out.println("output "+outputIndexOf);

    }

    private static String indexOfMethod(String input) {
        String str = "";
        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);


            if(str.indexOf(c)<0){

                str += c;
            }
        }
        System.out.println(str);
        return str;
    }

    private static String sortingMethod(String input) {
        char[] ch = input.toCharArray();
        Arrays.sort(ch);
        int res_ind =1;
        int iterate_ind = 1;

        while (iterate_ind<ch.length){
            if(ch[iterate_ind] != ch[iterate_ind-1]){
                 ch[res_ind] = ch[iterate_ind];
                    res_ind++;
            }
            iterate_ind++;
        }

        return new String(ch,0,res_ind);



    }
}
