package missiondsa180Ques.array;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ConvertStringtoInt {
    public static void main(String[] args) {
        String[] arr = {"09","24" , "67" , "98","33" ,"87"};
        //HashSet<Character> hashSet = new HashSet<>();
        LinkedList<Character> hashSet = new LinkedList<>();
        hashSet.add('1');
        hashSet.add('3');
        hashSet.add('5');
        hashSet.add('7');
        hashSet.add('9');
        /*int j=0;
        for(String i:arr){
           if(hashSet.contains(i.charAt(i.length()-1))) {
               arr[j]=i;
               j++;
           }

        }
        for(int i=0;i<j;i++){
            System.out.print(arr[i]+" ,");
        }*/
        Predicate<String>  predicate = (s)->{
            if(hashSet.contains(s.charAt(s.length()-1)))
            {
                return true;
            }
            return false;
        };
        

        Stream.of(arr).filter(predicate).forEach(System.out::print);
    }
}
