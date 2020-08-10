package javacursor;

import javax.print.Doc;
import java.util.*;

public class ComparableDemo implements Comparable<ComparableDemo> {
    int id ;
    String name;

    public ComparableDemo(){}

    public ComparableDemo(int id , String name){
        this.id = id;
        this.name = name;
    }


   // @Override
    public int compareTo(ComparableDemo o) {
        if(id >o.id )
            return 1;
        else if(id<o.id)
            return -1;
        else
            return 0;
    }

    public String toString(){
        return this.name;
    }

    Comparable<ComparableDemo> c =(o) -> {
        return this.name.compareTo(o.name);
    };

    public static void main(String[] args) {
        /*TreeSet<ComparableDemo> demos = new TreeSet<>();
        demos.add(new ComparableDemo(1,"name"));
        demos.add(new ComparableDemo(0,"a"));*/

        List<ComparableDemo> demos = new ArrayList<>();
        demos.add(new ComparableDemo(5,"name"));
        demos.add(new ComparableDemo(4 , "upanand"));
        Collections.sort(demos, new Comparator<ComparableDemo>() {
            @Override
            public int compare(ComparableDemo o1, ComparableDemo o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        Collections.sort(demos);

        System.out.println(demos);


        Hashtable hashtable = new Hashtable();
        hashtable.put(1,"upanand");
        hashtable.put(3,2);
        hashtable.put(2,'c');
       // hashtable.put(new ComparableDemo(),new Employee(1,"ii",3));
        System.out.println(hashtable);
    }
}
