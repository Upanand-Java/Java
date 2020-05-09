package basicJava.supplier;

import java.util.function.Supplier;

public class GenerateRandomPassword {
    /**
     * Main method which generate the random password of 8 digit where odd location should be covered by alphabet and spl char and even location
     * covered by digits eg -  A2F7G4@9
     * @param args
     */
    public static void main(String[] args) {

        Supplier<String> stringSupplier = ()->{
            String generatedPassword = "";
            Supplier<Integer> integerSupplier = ()-> (int)(Math.random()*10);
            Supplier<Character> characterSupplier = ()->{
                String symbol = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@$#";
                Character c = symbol.charAt((int)(Math.random()*29));
                return c;

            };
            for(int i=1;i<=8;i++){
               if(i%2==0){
                   generatedPassword = generatedPassword+integerSupplier.get();
               }else{
                   generatedPassword = generatedPassword+characterSupplier.get();
               }
            }
            return generatedPassword;


        };
        System.out.println(stringSupplier.get());
    }
}
