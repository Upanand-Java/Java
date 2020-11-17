package pegaproblems;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution {
    /**
     * This main method read the input csv file and print the map which contains key as
     * a partition sequence and value as List of size 2 ,in which first index would be occurrence
     * of positive and second would be occurrence  of negative .
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("D:\\inputdata.csv"));
        String line = "";

        Map< String ,List<Integer>> mp = new LinkedHashMap<>();
        List<String> rawList = new ArrayList<>();
        while ((line = reader.readLine())!= null)
                    rawList.add(line);

        List<Double> tempList = new ArrayList<>();
        int yes = 0;
        int no = 0;
        int val = 1;

        for(int i =1;i<rawList.size();i++) {
            if(tempList.size()<(rawList.size()-1)/10) {
                String[] eachLine = rawList.get(i).split(",");
                tempList.add(Double.parseDouble(eachLine[0]));
                if (eachLine[1].equals("1"))
                    yes++;
                else
                    no++;
            }else {
                i--;
                List<Integer> ls = new ArrayList<>();
                ls.add(yes);
                ls.add(no);
                mp.put("Partition "+String.valueOf(val++), ls);
                yes =0;
                no = 0;
                tempList.clear();
            }
        }
        List<Integer> list = new ArrayList<>();
        list.add(yes);
        list.add(no);
        mp.put( "Partition "+String.valueOf(val),list);
        System.out.println("output map is "+mp);
    }
}
