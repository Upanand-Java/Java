public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String input = "My name is upanand";
        String input2 = "is";
        isSubstring(input , input2);
        removeSpace(input);
    }

    private static void isSubstring(String input, String input2) {
        int start = 0;
        int end = input.length();
        int mid = end/2;
        int input2Val = 0;

        int count = 0;
        while (end>start && input2Val<input2.length() ){

           if(input.charAt(start) == input2.charAt(input2Val)) {
               input2Val++;



           }
           start++;

        }
    }

    private static void removeSpace(String input) {
        String result = "";
        for(int i=0;i<input.length();i++){
            int charVal = (int)input.charAt(i);
            if((charVal >=65 && charVal<=90) || (charVal >=97 && charVal<=122) ){
                result = result+input.charAt(i);
            }
        }

        System.out.println(result);

    }

    private Integer addTwoNUm(Integer i1 , Integer i2){
        if(i1 != null )
        return i1+i2;
        return null;
    }

}
