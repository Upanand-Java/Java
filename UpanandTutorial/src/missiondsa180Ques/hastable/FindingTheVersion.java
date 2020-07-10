package missiondsa180Ques.hastable;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class FindingTheVersion {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new BufferedReader(new FileReader("C:\\Users\\upanand\\Desktop\\Input.txt")));

        HashMap<String,Integer> apiCOunt = new HashMap<>();
        HashMap<String , String> lowerVersion = new HashMap<>();
        HashMap<String ,String> counterAppName = new HashMap<>();
        while (in.hasNextLine()){
            String line = in.nextLine();
            System.out.println(line);
            String[] arr = line.split(", ");


            apiCOunt.put(arr[1],apiCOunt.getOrDefault(arr[1],0)+1);

            if(lowerVersion.containsKey(arr[1])){
                int CurrentVersion = Integer.parseInt(arr[2].substring(1));
                int previousVersion = Integer.parseInt(lowerVersion.get(arr[1]).substring(1));
                if(CurrentVersion<previousVersion){
                    lowerVersion.put(arr[1],arr[2]);
                    counterAppName.put(arr[1],arr[0]);

                }

            }else{
                lowerVersion.put(arr[1],arr[2]);
                counterAppName.put(arr[1],arr[0]);
            }






        }
        System.out.println(lowerVersion);
        System.out.println(counterAppName);
       // List<String> ls = new ArrayList<>();
        Set<String> ls = new HashSet<>();
        for(Map.Entry<String,Integer> integerMap: apiCOunt.entrySet()){
            if (integerMap.getValue()>1){
             ls.add(counterAppName.get( integerMap.getKey()));
            }

        }
        System.out.println(ls);
    }
}
