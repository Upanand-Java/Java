package string;

public class RemoveDupOnceAgain {
    public static void main(String[] args) {
        String x = "abcdefgtttt";
        StringBuilder builder = new StringBuilder();

        for(int i=0;i<x.length();i++){
            if(builder.indexOf(String.valueOf(x.charAt(i)))<0){
                builder.append(x.charAt(i));
            }
        }
        System.out.println(builder.toString());
    }
}
