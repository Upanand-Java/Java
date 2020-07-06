import java.util.LinkedList;
import java.util.List;

public class Sol {
    public static void main(String[] args) {
        int n=1000;
        int k=3;

        List<Integer> list = new LinkedList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                list.add(i);
            }
        }
        int result =-1;

        System.out.println(list);
        if(list.size()>=k ){
            result = list.get(k-1);
        }


        System.out.println(result);
        //return result;
    }
}
