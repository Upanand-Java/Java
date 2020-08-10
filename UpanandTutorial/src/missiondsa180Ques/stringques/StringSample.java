package missiondsa180Ques.stringques;

public class StringSample {
    public static void main(String[] args) {
        String s = "daabccabba";

        boolean isMinimize = true;


            int middle = s.length() / 2;
            String firstPart = s.substring(0,middle);//aabcca
        System.out.println(firstPart);
            String secondPart = s.substring(middle);//cabba
        System.out.println(secondPart);
        while (isMinimize && firstPart.length()>0 && secondPart.length()>0) {
            if (secondPart.charAt(secondPart.length()-1) == firstPart.charAt(0)) {
                int i = 0;
                int k = 0;
                for (char c : firstPart.toCharArray()) {


                    if (!( c == secondPart.charAt(secondPart.length() - 1))) {
                        break;

                    }
                    i++;
                }
                System.out.println("i val "+i); //i=2
                for (int j = secondPart.length() - 1; j >= 0; j--) {

                    if (!(secondPart.charAt(j) == secondPart.charAt(secondPart.length() - 1))) {

                        break;
                    }
                    k++;
                }
                System.out.println(k);//k=1


                firstPart = firstPart.substring(i, firstPart.length());
                System.out.println("first"+firstPart.length()+firstPart); //bc
                secondPart = secondPart.substring(0, secondPart.length()- k);
                System.out.println("first"+secondPart.length()+secondPart);//abb
            } else {
                isMinimize = false;
            }
        }

        System.out.println(firstPart.length()+secondPart.length());
        System.out.println(firstPart);
        System.out.println(secondPart);

        System.out.println(secondPart+firstPart);



    }
}
