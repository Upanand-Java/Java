package missiondsa180Ques.stringques;

public class StringQues {
    public static void main(String[] args) {
        String s = "Abc18@gmail.com@dtffyo@yfff.ygg.gygy@x";
        //output - 81cbA@liamg.moc

        String[] splitAt = s.split("@");
      //  System.out.println();
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<splitAt.length;i++){

            if(splitAt[i].contains(".")){

                String[] splitDot = splitAt[i].split("\\.");
                System.out.println("in"+splitDot[0]);
                for(int j=0;j<splitDot.length;j++){
                    builder.append(reverseStr(splitDot[j])).append('.');

                }
                builder.deleteCharAt(builder.length()-1);

            }else{

                builder.append(reverseStr(splitAt[i]));
            }
            builder.append('@');

        }
        System.out.println(builder.deleteCharAt(builder.length()-1).toString());
    }

    private static String reverseStr(String s) {

       return new StringBuilder(s).reverse().toString();

    }

}
