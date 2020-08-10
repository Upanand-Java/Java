package customizedhmapsorting;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

//List sort based on the name if the name same then sort based on the name.

class StudentSet{
    int id;
    String name;

    public StudentSet(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentSet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}

public class TreeExample {
    public static void main(String[] args) {
        /*TreeSet<StudentSet> integers = new TreeSet<>(new MyComparable());
        integers.add(new StudentSet(1,"upanand"));
        integers.add(new StudentSet(7,"luvirat"));*/
        //integers.add(new StudentSet(6,"kohli"));
        List<StudentSet> integers = new ArrayList<>();
        integers.add(new StudentSet(2,"upanand"));
        integers.add(new StudentSet(7,"verma"));
        integers.add(new StudentSet(1,"upanand"));
        integers.add(new StudentSet(1,"upanand"));

        Collections.sort(integers,new MyComparable());

        HashMap<Integer , StudentSet> hashMap = new HashMap<>();
       // Consumer<StudentSet> consumer = s -> hashMap.put(s.id,s);


        integers.forEach(it-> hashMap.put(it.id,it));

        System.out.println(hashMap);


        System.out.println(integers);

        HashMap<StudentSet,Integer> map  = new HashMap<>();
        map.put(new StudentSet(1,"upanand"),1);
        map.put(new StudentSet(3,"ups"),2);
        System.out.println(map);

    }
}

class MyComparable implements Comparator<StudentSet>{

    @Override
    public int compare(StudentSet o1, StudentSet o2) {
       // System.out.println(o1.name+" "+o2.name);
        //System.out.println(o1.name.compareTo(o2.name));
        if(o1.name.compareTo(o2.name) !=0)
        return o1.name.compareTo(o2.name);
        else
            if(o1.id>o2.id){
                return 1;
            }else if(o1.id<o2.id){
                return -1;
            }else{
                return 0;
            }

    }
}
