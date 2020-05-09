package basicPractice;

import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String[] arr = {"a","b","a","c","w","a","b","d","b","a","a"};
        char[] chars = new char[arr.length];
        HashSet hashSet = new HashSet();
        for(String a:arr){
           hashSet.add(a);
        }
        System.out.println(hashSet);
 /*
        for(int i = 0;i<=arr.length-1;i++){
            for(int j = i+1;j<=arr.length-1;j++){
                if(arr[i]==arr[j]){
                    arr[j].replace(arr[j],"");
                }
            }
        }*/
        System.out.println("Removed duplicate");
        for(int k=0;k<=arr.length-1;k++){
            System.out.println(arr[k]);
        }

    }
}
