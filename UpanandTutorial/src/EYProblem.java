import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EYProblem {
  //[4:11 PM] Vikash Kumar (Guest)
  //
  //s1="abbaabcdeab"
  //​[4:11 PM] Vikash Kumar (Guest)
  //
  //k=3
    //s1="badfab" s2="ab"
    public static void main(String[] args) {
       //String s1="abbaabcdeab";
       //int k = 3;
      //  printGreaterThanK(s1 , k);
        String s1 = "badfabc";
        String s2 = "ab";
        findIndexOfAnagram(s1 , s2);

    }

    private static void findIndexOfAnagram(String s1, String s2) {
        System.out.println(s1+" "+s2);
        List<Integer> outputIndex = new ArrayList<>();

        for(int i=0;i<s1.length()-s2.length();i++){
            StringBuilder sb = new StringBuilder();
            for(int j=i;j<i+s2.length();j++){

                sb.append(s1.charAt(j));

            }
            System.out.println("builder is "+sb.toString());
            boolean is = isAnagram(sb.toString(),s2);
            System.out.println("anagram output "+is);
            if(is){
                outputIndex.add(i);
            }

        }
        System.out.println(outputIndex);

    }

    private static boolean isAnagram(String t1 , String t2){

       // System.out.println(t1);
       // System.out.println(t2);
        int[] arr = new int[256];

        for(int i= 0;i< t1.length();i++)
            arr[(int)t1.charAt(i)]++;

        for(int i= 0;i< t2.length();i++)
            arr[(int)t2.charAt(i)]--;

        for(int i:arr){
           // System.out.println(i);
            if(i !=0)
                return false;
        }

        return true;


    }












    private static void printGreaterThanK(String s1, int k) {
        Map<Character , Integer> map = new HashMap<>();

        for(int i=0;i<s1.length();i++){
            if(map.containsKey(s1.charAt(i))){
                map.put(s1.charAt(i) , map.get(s1.charAt(i))+1);

            }else {
                map.put(s1.charAt(i) , 1);
            }

        }

        for(Character c : map.keySet()){

            if(map.get(c) >= k){
                System.out.println(c+" "+map.get(c));

            }
        }
    }
}
