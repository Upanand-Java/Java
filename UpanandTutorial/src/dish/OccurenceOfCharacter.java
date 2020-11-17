package dish;

import java.util.*;

public class OccurenceOfCharacter {
    public static void main(String[] args) {
        String input = "upanand";
        getOccurence(input);
        int[] inputArr = {2,4,1,2,1,6,9};
        sortValue();
        mergeSort(inputArr ,0 , inputArr.length);
    }

    private static int[] mergeSort(int[] inputArr , int low , int high) {
        if(high>low){
            int mid = (high - low)/2;
           int[] temp =  mergeSort(inputArr , low , mid);
           int[] temp1 =  mergeSort(inputArr , mid+1 , high);
         //  int[] result = merge(temp , temp1);
           return result;

        }
        return null;


    }
    //1,2,3
    //2.4.7
    /*private static int[] merge(int[] temp, int[] temp1) {
        int[] result = new int[temp1.length+temp.length];
        int start = 0;
        int end =0;

    }*/

    private static void sortValue() {
        Map<Integer , Integer> integerMap = new HashMap<>();
        integerMap.put(1,6);
        integerMap.put(5,3);
        integerMap.put(4,1);
        integerMap.put(8,9);

        List<Map.Entry<Integer , Integer>> entryList = new ArrayList<>(integerMap.entrySet());
        Collections.sort(entryList , Comparator.comparingInt(e-> e.getValue()));

        LinkedHashMap<Integer , Integer> linkedHashMap = new LinkedHashMap<>();

        for(Map.Entry<Integer , Integer> entry : entryList){
            linkedHashMap.put(entry.getKey() , entry.getValue());
        }

        System.out.println(linkedHashMap);
    }

    private static void getOccurence(String input) {
        Map<Character , Integer> map = new HashMap<>();

        for(int i=0;i<input.length();i++){
            if(map.containsKey(input.charAt(i))){
                map.put(input.charAt(i) , map.get(input.charAt(i))+1);
            }else {
                map.put(input.charAt(i) , 1);
            }
        }

    }
}

//Employedd emp_id , emp_name , manger_id
//
