import java.util.HashMap;
import java.util.*;

public class Java8Code {
    public static void main(String[] args) {
        Map<String , Integer> marksVal = new HashMap<>();
        marksVal.put("Physics" , 76);

        marksVal.put("English" , 80);
        marksVal.put("chemistry" , 80);
        marksVal.put("zzzzz" , 80);
        marksVal.put("Math" , 90);

        List<Map.Entry<String , Integer>> ls = new ArrayList<>(marksVal.entrySet());
       // Collections.sort(ls , Comparator.ComparingInt(e1-> e1.getvalue()));
        Collections.sort(ls , Comparator.comparingInt(e1 -> -e1.getValue()));

        for(Map.Entry<String , Integer> mp: ls){
            System.out.println(mp.getKey()+" "+mp.getValue());
        }
    }



    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
