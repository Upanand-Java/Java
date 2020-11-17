package basicGroovyCodePractice.valuelabs;

import java.util.ArrayList;
import java.util.List;

public class xyz {
    public static void main(String[] args) {
        try {
            List l = new ArrayList();
            l.add(6);
            System.out.println(l.get(-1));
        }catch (Exception e){
            e.printStackTrace();
        }/*catch (ArrayIndexOutOfBoundsException e){ //Exception is already caught

        }*/
    }
}
