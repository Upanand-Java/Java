package oracle;

public class Write100TimesWithoutLoop {
    static int i=1;
    public static void main(String[] args) {

        if(i<=100){
            System.out.println(i++);
            main(null);
        }

    }


}