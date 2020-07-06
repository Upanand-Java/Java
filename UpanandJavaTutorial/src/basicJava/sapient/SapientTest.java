
package basicJava.sapient;

import java.util.HashMap;

public class SapientTest {
    public static void main(String[] args) {
        int[] arr  =  {-2,0,3,2,4,-7};
        int[] sum = new int[arr.length];

        int temp = 0;
        for(int i=0;i<arr.length;i++){
            temp = temp +arr[i];
            sum[i] = temp;

        }

        /*for(int j:sum){
            System.out.print(j+" ,");
        }*/

        int subArrayCOunt = 0;
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int k=0;k<sum.length;k++){
            if(sum[k] == 0){
                subArrayCOunt = subArrayCOunt+1;
            }

            if(hashMap.containsKey(sum[k])){

                subArrayCOunt++;
            }
            hashMap.put(sum[k],k);

        }

        /*for(int k=0;k<arr.length;k++){

        }*/


        System.out.println(subArrayCOunt);


    }
}
