package missiondsa180Ques.math;

/*
 * Save this in a file called Main.java and compile it. To test it
 * create the file `input.txt` in the workspace / Working Directory
 * (For Eclipse/VisualStudio, by default this is the top level project folder)
 */

/*
   Example file showing how to write a program that reads
   input from `input.txt` in the current directory
   and writes output to `output.txt` in the current directory
*/

/* Do not add a package declaration */
import java.util.*;
import java.io.*;

/* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
/* You may add any imports here, if you wish, but only from the
   standard library */

/* Do not add a namespace declaration */

public class Main {
    public static void main (String[] args) {
        ArrayList<String> inputData = new ArrayList<String>();
        int numLines = 0;
        try {
            Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));

            /* Here we can read in the input file */
            /* In this example, we're reading all the lines of file
               `input.txt` and then ignoring them.
               You should modify this part of the
               program to read and process the input as desired */
            Map<String,String> apiV = new HashMap();
            Map<String,String> appName = new HashMap();
            Map<String,Integer> countMap = new HashMap();


            while(in.hasNextLine()) {
                String line = in.nextLine();
                System.out.println(line);
                if (!line.isEmpty())
                    numLines++;
                String[] str = line.split(", ");
                countMap.put(str[1],countMap.getOrDefault(str[1],0)+1);
                if (apiV.containsKey(str[1])) {
                    String version = apiV.get(str[1]);
                    if(Integer.parseInt(str[2].substring(1))< Integer.parseInt(version.substring(1))){
                        apiV.put(str[1],str[2]);
                        appName.put(str[1],str[0]);
                    }

                }else{
                    apiV.put(str[1],str[2]);
                    appName.put(str[1],str[0]);

                }




            }

            Set<String> hs = new HashSet<>();
            for(Map.Entry<String,Integer> hm : countMap.entrySet()){
                if(hm.getValue()>1)
                    hs.add(appName.get(hm.getKey()));

            }
            /* In this example, we're writing `num_lines` to
               the file `output.txt`.
               You should modify this part of the
               program to write the desired output */
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
            Iterator<String> it = hs.iterator();
            while(it.hasNext()) {
                output.println(it.next());
            }
            output.close();
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt");
        }
    }
}

