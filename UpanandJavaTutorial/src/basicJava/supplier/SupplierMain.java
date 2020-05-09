package basicJava.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierMain {
    public static void main(String[] args) {
        Supplier<Date> dateSupplier = ()-> new Date();
        System.out.println(dateSupplier.get());

        //generate some random name
        Supplier<String> stringSupplier = ()-> {
        String[] strings = {"sunny","bunny","chinny","katina","aaaa"};
        int x  = (int)( Math.random()*5); //Math.random() always generate 0 to 0.99999999999
        return strings[x];
        };
       // System.out.println("Random ame "+stringSupplier.get());

        //Generate random otp
        Supplier<String> integerSupplier = ()->{
            String otp = "";
            for(int i=0;i<6;i++){
                otp = otp+(int)(Math.random()*10);
            }
            return otp;

        };
        System.out.println("hey "+stringSupplier.get()+" your otp is "+integerSupplier.get());

    }

}
