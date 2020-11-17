public class InformaticaCOde {
    public static void main(String[] args) {
        int x = 25;
           getResult(x);
        //System.out.println(isOrderAccepted);
    }

    private static void getResult(int i) {
        boolean isAccepted = false;

        for(int x =1;x<=i ;x++) {
            int fiveIndicator = x % 5;
            int eightIndicator = x % 8;
            int threeIndicator = x % 3;


            if ((x % 5 == 0) || (x % 3 == 0) || (x % 8 == 0))
                System.out.println(x+" "+"true");
            else if ((fiveIndicator % 3 == 0) || (eightIndicator % 3 == 0) || (eightIndicator % 5 == 0) ||(threeIndicator % 5==0))
                System.out.println(x+" "+"true");
            else
                System.out.println(x+" "+"false");
        }




    }
}
