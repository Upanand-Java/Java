package basicJava;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateRemoveNullandEmpty {

    public static void main(String[] args) {
        String[] arr = {"wdjiwji","","rrr444","3er4tt",null,"","fheufh",null};
        Predicate<String> predicate = s-> s!=null && s.length() !=0;
        ArrayList<String> arrayList = new ArrayList();
        for(String a:arr){
            if(predicate.test(a)){
                arrayList.add(a);
            }
        }
        for(String str:arrayList)
        System.out.println(str);


    }
}
