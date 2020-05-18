package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class IsLapindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalString = scanner.nextInt();


        List<String> strList = new ArrayList<>(totalString);

        for(int i=0;i<totalString;i++){
            strList.add(scanner.next().toLowerCase());
            //System.out.println();
        }
        List<String> resultList = new ArrayList<>(totalString);



        List<String> right = new ArrayList<>();
        List<String> left = new ArrayList<>();



        for(int i =0;i<strList.size();i++){
            //System.out.println("under main for!!");
            String[] strArray = strList.get(i).split("");
            for(int j=0;j<strArray.length/2;j++){
                right.add(strArray[j]);
            }
           if(strList.get(i).length()%2==0){

               for(int k =strArray.length/2;k<strArray.length;k++){
                   left.add(strArray[k]);
               }
           }else {

               for(int k =(strArray.length/2)+1;k<strArray.length;k++){
                   left.add(strArray[k]);
               }
           }
            Collections.sort(right);
            System.out.println("Right subList "+right);
            Collections.sort(left);
            System.out.println("Left SubList "+left);

                if (right.equals(left)){
                    //resultList.add("YES");
                    System.out.println("YES");
                } else {
                    //resultList.add("NO");
                    System.out.println("NO");
                }

                right.clear();
                left.clear();

        }
      /*  for (String s: resultList){
            System.out.println(s);
        }*/
    }
}
