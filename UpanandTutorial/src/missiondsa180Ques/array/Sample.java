package missiondsa180Ques.array;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

import static java.lang.System.out;

public class Sample {
    public static void main(String[] args) throws ParseException {
      /*  CopyOnWriteArrayList copy = new CopyOnWriteArrayList();
        copy.add(9);
       // System.out.println(copy);
        for(Object a: copy){
            copy.add(5);
           // System.out.println(a);
        }*/
        //System.out.println(copy);

        {
            int x = 30;
            out.println(" "+x+" ");

        }

        /*static
        {

        }*/

        /*String temp = "10.87";
        int a = Integer.parseInt(temp);
        System.out.println(a);*/

        SimpleDateFormat pdf = new SimpleDateFormat("dd/MM/yyyy G");
        Date parse = pdf.parse("30/01/-2020 AD");
       // System.out.println(pdf.parse(parse));

        int x = -4;

        //System.out.println(x>>1);
        //System.out.println(" And ");
        int y =4;
        //System.out.println(y>>2);

  /*     System.out.println(1+
                2 == +
                3+
                +
                +5+
               ++6 +
               --7);
*/

    /*int x1 = 10;
    for(int i =10;i>=x;i--){
        int x1 = 10-i;
        out.println(x1);
    }

       out.println("APC");*/

   /* System.out.print(10*20 + "ABC");
    System.out.println("DEF" +  10*20);*/

    /*double data = 444.324;
    float f = data;
    int value = f;
        out.println();*/

    /*double data = 20.324;
    int sum =6;
    float value = 5.1f;
    System.out.println(data+sum+value);*/


    ArrayList<Integer> integers1 = new ArrayList<>();
    integers1.add(23);
    integers1.trimToSize();

        out.println(integers1.size());




        SortedSet<Integer> integers = new TreeSet<>();
        integers.add(3);
        integers.add(1);
        //System.out.println(integers);
        int[] org = new int[]{1,2,3};
        int[] original = Arrays.copyOf(org , 5);
        int[] copy1 = Arrays.copyOfRange(original , 0,4);

        for(int i=0;i<copy1.length;i++){
           // System.out.println(copy1[i]+" ");
        }

        ArrayList obj = new ArrayList();
        obj.add("A");
        obj.ensureCapacity(3);
        //System.out.println(obj.size());

    }
}
